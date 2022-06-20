package com.bi.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notification.email")
public class NotificationProperties {

	private String hostServer;

	private String portServer;

	public String getHostServer() {
		return hostServer;
	}

	public void setHostServer(String hostServer) {
		this.hostServer = hostServer;
	}

	public String getPortServer() {
		return portServer;
	}

	public void setPortServer(String portServer) {
		this.portServer = portServer;
	}
}
