package com.danielberryman.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach coach1 = context.getBean("tennisCoach", TennisCoach.class);
		HockeyCoach coach2 = context.getBean("hockeyCoach", HockeyCoach.class);
		BalletCoach coach3 = context.getBean("balletCoach", BalletCoach.class);
		
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach3.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach3.getDailyFortune());
		System.out.println(coach1.getEmail());
		
		context.close();

	}

}
