package com.bi.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.bi.model.Client;

@Profile("dev")
@NotificationType(UrgencyLevel.CRITICAL)
@Component
public class NotificationEmailMock implements Notification {
	
	public NotificationEmailMock() {
		System.out.println("NotificationEmail MOCK");
	}
	
	@Override
	public void notificate(Client client, String message) {
		System.out.printf("Mock: Notificando %s através do email %s: %s\n",
				client.getName(), client.getEmail(), message);
	}
}
