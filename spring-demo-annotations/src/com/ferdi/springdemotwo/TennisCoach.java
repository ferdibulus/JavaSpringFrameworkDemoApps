package com.ferdi.springdemotwo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//If we dont write anything below component, java give us default bean id as a lower case type of class.
@Component
//@Scope("prototype")//by default the scope was singleton
public class TennisCoach implements ICoach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	//in here we did field injection and in this injection method we dont need setter method 
	private IFortuneService fortuneService;
	
	

	public TennisCoach() { //constructer injection in annotation
		System.out.println("TennisCoach: inside default constructer");
		
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach : inside of doMyStartupStuff ");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach : inside of doMyCleanupStuff ");
	}
	
	//any autowired for any methods
	
	/*
	 
	 * @Autowired
	public void doSomeCrazyStuff(IFortuneService fortuneService) {
		System.out.println("TennisCoach: inside doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}
	
	
	@Autowired //setter injection in annotation
	
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("TennisCoach: inside setFortuneService method");
		this.fortuneService = fortuneService;
	}
*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}
		
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
