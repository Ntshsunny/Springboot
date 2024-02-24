package com.Ntsh.LearningSpringBoot.StartLearnSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/config")
	public CurrencyServiceConfiguration currency() {
		
		return configuration;
	}
}
