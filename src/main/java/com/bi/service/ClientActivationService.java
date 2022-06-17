package com.bi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bi.model.Client;
import com.bi.notification.Notification;

@Component
public class ClientActivationService {

	@Autowired(required = false)
	private List<Notification> notifications;

	public void ativate(Client client) {
		client.activate();

		for (Notification notification : notifications) {
			notification.notificate(client, "Seu cadastro no sistema está ativo!");
		}
	}
}
