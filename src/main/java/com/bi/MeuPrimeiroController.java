package com.bi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bi.model.Client;
import com.bi.service.ClientActivationService;

@Controller
public class MeuPrimeiroController {
	
	private ClientActivationService clientActivationService;
	
	public MeuPrimeiroController(ClientActivationService clientActivationService) {
		this.clientActivationService = clientActivationService;
		
		System.out.println("MeuPrimeiroController" + clientActivationService);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Client bianca = new Client("Bianca", "bischmitt98@gmail.com", "48985013036");
		clientActivationService.ativate(bianca);

		return "Hello!";
	}
}
