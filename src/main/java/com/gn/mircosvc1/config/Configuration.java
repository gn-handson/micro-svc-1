package com.gn.mircosvc1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@ConfigurationProperties("microsvc-one.properties")
@Getter
public class Configuration {
	
	private int configValOne1;
	private String configValOne2;

}
