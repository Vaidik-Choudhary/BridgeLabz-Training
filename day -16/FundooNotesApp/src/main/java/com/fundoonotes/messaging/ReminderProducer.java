package com.fundoonotes.messaging;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReminderProducer {

	private final JmsTemplate jmsTemplate;

	public ReminderProducer(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void sendPasswordResetRequest(String email, String resetToken) {

		String messageBody = email + "|" + resetToken;

		jmsTemplate.convertAndSend("password-reset-queue", messageBody);
	}
}