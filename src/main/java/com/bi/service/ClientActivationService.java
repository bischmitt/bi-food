package com.bi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.bi.model.Client;

@Component
public class ClientActivationService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativate(Client client) {
		client.activate();
		
		eventPublisher.publishEvent(new ActivatedClientEvent(client));
	}
}
