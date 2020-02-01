package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloBean {

	public static void main(String[] args) {
		
		//Loading the context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the container
		Coach coach = context.getBean("baseballCoach",Coach.class);
		
		//Using retrieved bean to consume methods
		System.out.println(coach.getWorkOut());
		
		//close the resource container
		context.close();
		
	}

}
