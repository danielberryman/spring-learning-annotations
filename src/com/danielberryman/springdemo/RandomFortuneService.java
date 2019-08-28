package com.danielberryman.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	@Value("${test.fortunes}")
	String[] fortunes;

	@Override
	public String getFortune() {
		Random r = new Random();
		return fortunes[r.nextInt(fortunes.length)];
	}

}
