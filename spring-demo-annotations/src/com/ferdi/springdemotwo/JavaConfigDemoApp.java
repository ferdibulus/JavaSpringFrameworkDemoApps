package com.ferdi.springdemotwo;

import java.io.Closeable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigNoXML.class);
		
		//get the bean from spring container
		ICoach theCoach = context.getBean("tennisCoach",ICoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
