package com.fundoonotes.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.entity.User;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.service.impl.EmailService;

@Component
public class NoteReminderConsumer {

	private final UserRepository userRepository;
	private final EmailService emailService;

	public NoteReminderConsumer(UserRepository userRepository,
			EmailService emailService) {

		this.userRepository = userRepository;
		this.emailService = emailService;
	}

	
	
	
	@RabbitListener(queues = "reminder-queue")
	public void handleReminder(String message) {

		String[] parts = message.split("\\|");

		String noteTitle = parts[0];
		int userId = Integer.parseInt(parts[1]);

		User user = userRepository.findById(userId)
				.orElseThrow(() -> new IllegalArgumentException("User not found"));

		emailService.sendReminderEmail(user.getEmail(), noteTitle);
	}
}