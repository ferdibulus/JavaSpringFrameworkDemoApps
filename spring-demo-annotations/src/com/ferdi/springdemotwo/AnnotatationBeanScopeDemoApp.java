package com.ferdi.springdemotwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring conf
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("tennisCoach", ICoach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print
		System.out.println("\nPonting to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		//close context
		context.close();

	}

}
