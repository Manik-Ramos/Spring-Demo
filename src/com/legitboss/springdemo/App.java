package com.legitboss.springdemo;

public class App {

	public static void main(String[] args) {
		Coach coach = new BaseballCoachImpl();
		System.out.println(coach.getWorkOut());
	}

}
