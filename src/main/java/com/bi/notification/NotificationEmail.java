package com.bi.notification;

import org.springframework.stereotype.Component;

import com.bi.model.Client;

public class NotificationEmail implements Notification {
	
	private boolean upperCase;
	private String hostServerSMTP;

	public NotificationEmail(String hostServerSMTP) {
		this.hostServerSMTP = hostServerSMTP;
		System.out.println("NotificationEmail");
	}
	
	@Override
	public void notificate(Client client, String message) {
		if(this.upperCase) {
			message = message.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do email %s usando SMTP %s: %s\n",
				client.getName(), client.getEmail(), this.hostServerSMTP, message);
	}

	public void setUpperCase(boolean upperCase) {
		this.upperCase = upperCase;
	}
}
