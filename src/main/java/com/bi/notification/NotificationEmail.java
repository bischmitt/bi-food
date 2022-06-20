package com.bi.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bi.model.Client;


@NotificationType(UrgencyLevel.NORMAL)
@Component
public class NotificationEmail implements Notification {

	@Value("${notification.email.host-server}")
	private String host;
	
	@Value("${notification.email.port-server}")
	private Integer port;

	@Override
	public void notificate(Client client, String message) {
		System.out.println("Host: " + host);
		System.out.println("Port: " + port);
		
		System.out.printf("Notificando %s através do email %s: %s\n",
				client.getName(), client.getEmail(), message);
	}
}
