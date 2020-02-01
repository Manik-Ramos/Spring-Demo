package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionBean {

	public static void main(String[] args) {
		//Loading the context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the container
		CricketCoachImpl coach = context.getBean("cricketCoach",CricketCoachImpl.class);
		
		//Using retrieved bean to consume methods
		System.out.println(coach.getWorkOut());
		System.out.println(coach.getFortune());
		System.out.println(coach.getExperience());
		System.out.println(coach.getEmail());
				
		//close the resource container
		context.close();

	}

}
