package com.bi.notification;

import org.springframework.stereotype.Component;

import com.bi.model.Client;

@Component
public class NotificationEmail implements Notification {
	
	@Override
	public void notificate(Client client, String message) {
//		if(this.upperCase) {
//			message = message.toUpperCase();
//		}
		System.out.printf("Notificando %s através do email %s: %s\n",
				client.getName(), client.getEmail(), message);
	}

//	public void setUpperCase(boolean upperCase) {
//		this.upperCase = upperCase;
//	}
}
