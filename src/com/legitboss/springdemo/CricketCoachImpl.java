package com.legitboss.springdemo;

public class CricketCoachImpl implements CoachDao {

	private String email;
	private String experience;
	private FortuneServiceDao fortuneServiceDao;
	
	public CricketCoachImpl() {
		System.out.println("This was performed using Setter Injection...");
	}

	public FortuneServiceDao getFortuneServiceDao() {
		return fortuneServiceDao;
	}
	
	public void setFortuneServiceDao(FortuneServiceDao fortuneService) {
		System.out.println("Inside Setter Method...setFortuneServiceDao");
		this.fortuneServiceDao = fortuneService;
	}
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inside Setter Method...setEmail");
		this.email = email;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		System.out.println("Inside Setter Method...setExperience");
		this.experience = experience;
	}

	@Override
	public String getWorkOut() {
		return "Net Practice for 15 mins on a daily basis";
	}

	@Override
	public String getFortune() {
		return this.fortuneServiceDao.getFortune()+" cricket player";
	}

}
