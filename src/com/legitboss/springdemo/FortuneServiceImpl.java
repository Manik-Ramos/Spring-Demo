package com.legitboss.springdemo;

public class FortuneServiceImpl implements FortuneServiceDao{
	
	@Override
	public String getFortune() {
		return "Today will be a pleasant day";
	}
}
