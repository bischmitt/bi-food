package com.bi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bi.notification.NotificationEmail;
import com.bi.service.ClientActivationService;

//	ESTE ARQUIVO PODE SER EXCLUÍDO, POIS AS CONFIGURAÇÕES ABAIXO FORAM REORGANIZADAS NOS ARQUIVOS NotificationConfig e ServiceConfig.

//@Configuration
// Depois que eu crio o serviceConfig eu preciso comentar esta anotação para a aplicação funcionar.
public class BiConfig {

	@Bean
//	O Bean vai instanciar, inicializar um objeto do tipo NotificationEmail e que será
//	gerenciado pelo container Spring. O spring vai escanear as classes, identificar a classe
//	BiConfig e a anotação @Configuration, que tem como objetivo definir os Beans
//  Um bean é um objeto que é instanciado, montado e gerenciado pelo Spring IoC container.
	public NotificationEmail notificationEmail() {
		NotificationEmail notification = new NotificationEmail("smtp.bischmitt98@gmail.com");
		notification.setUpperCase(true);
		return notification;
	}

//	@Bean
//	Estou usando este Bean e, por isso, posso comentar a anotação Component do ClientActivationService
// que o projeto vai rodar da mesma forma.
//	public ClientActivationService clientActivationService() {
//		return new ClientActivationService(notificationEmail());
//	}
}
