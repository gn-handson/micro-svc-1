package com.gn.mircosvc1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gn.mircosvc1.config.Configuration;
import com.gn.mircosvc1.domain.ServiceOneConfiguration;

@RestController
public class ServiceOneController {
	
	@Autowired
	Configuration svc1Config;
	
	@GetMapping("/svc1config")
	public ServiceOneConfiguration retrieveServiceOneConfiguration() {
		return new ServiceOneConfiguration(svc1Config.getConfigValOne1(), svc1Config.getConfigValOne2());
	}
}
