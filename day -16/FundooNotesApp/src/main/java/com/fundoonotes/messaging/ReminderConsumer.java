package com.fundoonotes.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReminderConsumer {

	@JmsListener(destination = "password-reset-queue")
	public void handlePasswordResetRequest(String messageBody) {

		String[] parts = messageBody.split("\\|");

		String email = parts[0];
		String resetToken = parts[1];

		sendActualEmail(email, resetToken);
	}

	private void sendActualEmail(String email, String resetToken) {

		try {

			// Temporary simulation of a slow email service
			Thread.sleep(3000);

			System.out.println("Password reset email sent to: " + email);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();
		}
	}
}