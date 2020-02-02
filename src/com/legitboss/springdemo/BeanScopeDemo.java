package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		
		BaseballCoachImpl baseBallCoach1 = context.getBean("baseballCoach",BaseballCoachImpl.class);
		
		BaseballCoachImpl baseBallCoach2 = context.getBean("baseballCoach",BaseballCoachImpl.class);
		
		boolean resultOfScopes = (baseBallCoach1 == baseBallCoach2);
			
		if(resultOfScopes){
			System.out.println("***The scopes are same as a result of Singleton scope***");
			System.out.println("Their references are:\n");
			System.out.println("Reference of baseBallCoach1: "+baseBallCoach1);
			System.out.println("Reference of baseBallCoach2: "+baseBallCoach2);
		} else {
			System.out.println("***The scopes are same as a result of Prototype scope***");
			System.out.println("Their references are:\n");
			System.out.println("Reference of baseBallCoach1: "+baseBallCoach1);
			System.out.println("Reference of baseBallCoach2: "+baseBallCoach2);
		}
		
		
	}

}
