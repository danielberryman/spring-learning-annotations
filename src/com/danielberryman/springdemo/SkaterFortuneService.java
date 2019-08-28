package com.danielberryman.springdemo;

public class SkaterFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You're rockin' dude!";
	}

}
