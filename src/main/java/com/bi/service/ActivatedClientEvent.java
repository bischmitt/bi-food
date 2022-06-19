package com.bi.service;

import com.bi.model.Client;

public class ActivatedClientEvent {
	private Client client;
	
	public ActivatedClientEvent(Client client) {
		super();
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}
}
