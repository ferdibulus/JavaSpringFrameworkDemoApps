package com.ferdi.springdemo;

public class CricketCoach implements ICoach {

	private IFortuneService fortuneService;
	//add new fields for emaialAddress and teamName
	private String emialAddresse;
	private String teamName;
	
	
	public String getEmialAddresse() {
		return emialAddresse;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setEmialAddresse(String emialAddresse) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emialAddresse = emialAddresse;
	}

	public void setTeamName(String teamName) {
		System.out.println("CricketCoach: inside setter method - setTeamName");
		this.teamName = teamName;
	}

	//create a no-arg cons.
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructer");
	}
	
	//our setter method 
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
