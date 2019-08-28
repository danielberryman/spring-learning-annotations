package com.danielberryman.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.properties")
public class SkateConfig {
	
	@Bean
	public SkaterFortuneService skaterFortuneService() {
		return new SkaterFortuneService();
	}
	
	@Bean
	public SkateboardCoach skateboardCoach() {
		return new SkateboardCoach(skaterFortuneService());
	}

}
