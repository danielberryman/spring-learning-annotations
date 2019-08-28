package com.danielberryman.springdemo;

public class SkateboardCoach implements Coach {

	private FortuneService fortuneService;
	
	public SkateboardCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Focus on grinding and dropping in today.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
