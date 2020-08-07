package com.ferdi.springdemo;

public class TrackCoach implements ICoach {
	
	private IFortuneService fortuneService;
	

	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : inside method doMyCleanupStuff");
	}
	
}
