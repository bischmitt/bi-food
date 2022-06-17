package com.bi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bi.model.Client;
import com.bi.notification.Notification;

@Component
public class ClientActivationService {

	@Qualifier("urgent")
// A anotação marcada no NotificationSMS tem que ser anotada aqui também.
	@Autowired(required = false)
	private Notification notification;

	public void ativate(Client client) {
		client.activate();

		if (notification != null) {
			notification.notificate(client, "Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Não existe notificador, mas cliente foi ativado!");
		}
	}
}
