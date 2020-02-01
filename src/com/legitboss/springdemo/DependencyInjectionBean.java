package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionBean {

	public static void main(String[] args) {
		
		//Loading the context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the container
		CoachDao coach = context.getBean("baseballCoach",CoachDao.class);
		
		//Using retrieved bean to consume methods
		System.out.println(coach.getWorkOut());
		System.out.println(coach.getFortune());
				
		//close the resource container
		context.close();
		
	}

}
