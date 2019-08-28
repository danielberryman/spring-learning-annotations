package com.danielberryman.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		
		SwimCoach coach1 = context.getBean("swimCoach", SwimCoach.class);
		SwimCoach coach2 = context.getBean("swimCoach", SwimCoach.class);
		
		boolean result = (coach1 == coach2);
		
		System.out.println(result);
		System.out.println(coach1.getEmail());
		System.out.println(coach2.getEmail());
		
		context.close();
	}

}
