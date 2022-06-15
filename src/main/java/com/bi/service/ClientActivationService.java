package com.bi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bi.model.Client;
import com.bi.notification.Notification;

@Component
public class ClientActivationService {

	@Autowired
	private Notification notification;

//	public ClientActivationService(Notification notification) {
//		this.notification = notification;
//		
//		System.out.println("ClientActivationService: " + notification );
//	}

	public void ativate(Client client) {
		client.activate();
		notification.notificate(client, "Seu cadastro no sistema está ativo!");
	}
}
