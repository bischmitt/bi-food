package com.bi.notification;

import org.springframework.stereotype.Component;

import com.bi.model.Client;

@Component
public class NotificationSMS implements Notification {
	
	@Override
	public void notificate(Client client, String message) {
		System.out.printf("Notificando %s por SMS atráves do telefone %s: %s\n",
				client.getName(), client.getTelephone(), message);
	}
}
