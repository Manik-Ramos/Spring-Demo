package com.legitboss.springdemo;

public class HockeyCoachImpl implements CoachDao{
	
	private FortuneServiceDao fortuneService;
	
	public HockeyCoachImpl() {	}
	
	public HockeyCoachImpl(FortuneServiceDao fortuneService) {
		System.out.println("This was performed using Dependency Injection...");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkOut() {
		return "Hockey Coach Workout!!!";
	}
	
	@Override
	public String getFortune() {
		return this.fortuneService.getFortune()+" Hockey Player!!!";
	}
}
