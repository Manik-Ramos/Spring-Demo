package com.legitboss.springdemo;

public class BaseballCoachImpl implements CoachDao{
	
	private FortuneServiceDao fortuneService;
	
	public BaseballCoachImpl() {}
	
	public BaseballCoachImpl(FortuneServiceDao fortuneService) {
		System.out.println("This was performed using Dependency Injection...");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkOut() {
		return "Baseball Coach Workout!!!";
	}
	
	@Override
	public String getFortune() {
		//using dependency helper to output values
		return this.fortuneService.getFortune()+" Baseball Player";
	}
	
	public void initMethod() {
		System.out.println("Init method operations");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy method operations");
	}
}
