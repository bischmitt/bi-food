package com.bi.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.bi.model.Client;

@Primary
@Component
public class NotificationEmail implements Notification {
	
	@Override
	public void notificate(Client client, String message) {
		System.out.printf("Notificando %s através do email %s: %s\n",
				client.getName(), client.getEmail(), message);
	}
}
