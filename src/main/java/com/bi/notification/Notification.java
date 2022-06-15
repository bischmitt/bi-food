package com.bi.notification;

import com.bi.model.Client;

public interface Notification {

	void notificate(Client client, String message);

}