package com.ling.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration {

	@Bean
	public Object object() {
		System.out.println("create object");
		return new Object();
	}
}