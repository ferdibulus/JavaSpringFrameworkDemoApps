package com.ferdi.springdemo;

public class BaseballCoach implements ICoach {

	
		
	//define a private field for the dependencey
	private IFortuneService fortuneService;
	
	//define a constructer for dependency injection
    public BaseballCoach(IFortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
    	fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
  
	

}
