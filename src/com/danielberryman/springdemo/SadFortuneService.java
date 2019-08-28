package com.danielberryman.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Oh no...it's a bad day :(";
	}

}
