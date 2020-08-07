package com.ferdi.springdemotwo;

import java.io.Closeable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyLog.class,SportConfigNoXML.class);
		
		//get the bean from spring container
		//ICoach theCoach = context.getBean("swimCoach",ICoach.class);
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		//call a method on the bean
		//System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//call method to get the daily fortune
		//System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
