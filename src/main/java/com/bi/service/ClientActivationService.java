package com.bi.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bi.model.Client;
import com.bi.notification.Notification;
import com.bi.notification.NotificationType;
import com.bi.notification.UrgencyLevel;

//@Component
public class ClientActivationService {

	@NotificationType(UrgencyLevel.NORMAL)
	@Autowired(required = false)
	private Notification notification;

//	@PostConstruct
	public void init() {
		System.out.println("INIT");
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
	public void ativate(Client client) {
		client.activate();

		if (notification != null) {
			notification.notificate(client, "Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Não existe notificador, mas cliente foi ativado!");
		}
	}
}
