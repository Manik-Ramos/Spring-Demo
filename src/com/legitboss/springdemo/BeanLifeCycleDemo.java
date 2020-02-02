package com.legitboss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		//create context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle-applicationContext.xml");
		
		//use beans
		BaseballCoachImpl baseBallCoach = context.getBean("baseballCoach",BaseballCoachImpl.class);
		
		System.out.println(baseBallCoach.getFortune());
		System.out.println(baseBallCoach.getWorkOut());
		
		//close context
		context.close();
	}

}
