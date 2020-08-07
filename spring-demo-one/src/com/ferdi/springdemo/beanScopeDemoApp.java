package com.ferdi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring conf file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		//retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("myCoach", ICoach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print
		System.out.println("\nPointing to the same object : " + result);
		System.out.println("\nMemory location for theCoach : " + theCoach);
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach);

		//close the context
	}

}
