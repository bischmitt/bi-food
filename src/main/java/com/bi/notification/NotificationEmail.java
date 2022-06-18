package com.bi.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.bi.model.Client;

@Profile("prod")
@NotificationType(UrgencyLevel.NORMAL)
@Component
public class NotificationEmail implements Notification {

	public NotificationEmail() {
		System.out.println("NotificationEmail REAL");
	}

	@Override
	public void notificate(Client client, String message) {
		System.out.printf("Notificando %s através do email %s: %s\n",
				client.getName(), client.getEmail(), message);
	}
}
