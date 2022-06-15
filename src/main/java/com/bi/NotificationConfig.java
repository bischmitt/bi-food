package com.bi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bi.notification.NotificationEmail;

@Configuration
public class NotificationConfig {
	
	@Bean
	public NotificationEmail notificationEmail() {
		NotificationEmail notification = new NotificationEmail("smtp.bischmitt98@gmail.com");
		notification.setUpperCase(true);
		return notification;
	}
}
