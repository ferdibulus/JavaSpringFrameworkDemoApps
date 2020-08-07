package com.ferdi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring conf file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		
		//retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkout());

		//close the context
		context.close();
	}

}
