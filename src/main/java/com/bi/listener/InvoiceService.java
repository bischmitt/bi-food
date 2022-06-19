package com.bi.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.bi.notification.Notification;
import com.bi.notification.NotificationType;
import com.bi.notification.UrgencyLevel;
import com.bi.service.ActivatedClientEvent;

@Component
public class InvoiceService {
	
	@NotificationType(UrgencyLevel.NORMAL)
	@Autowired
	private Notification notification;
	
	@EventListener
	public void activatedClientListener(ActivatedClientEvent event) {
		System.out.println("Emitindo nota fiscal para cliente " + event.getClient().getName());
	}
}
