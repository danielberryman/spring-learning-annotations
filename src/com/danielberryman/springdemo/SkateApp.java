package com.danielberryman.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SkateApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SkateConfig.class);
		
		SkateboardCoach coach1 = context.getBean("skateboardCoach", SkateboardCoach.class);
		
		System.out.println(coach1.getDailyFortune());
		System.out.println(coach1.getDailyWorkout());
		
		context.close();
	}

}
