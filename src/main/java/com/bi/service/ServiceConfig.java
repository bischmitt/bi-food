package com.bi.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ClientActivationService clientActivationService() {
		return new ClientActivationService();
	}
}
