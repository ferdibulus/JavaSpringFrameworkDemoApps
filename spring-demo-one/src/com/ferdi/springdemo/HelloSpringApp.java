package com.ferdi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
