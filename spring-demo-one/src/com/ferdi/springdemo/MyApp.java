package com.ferdi.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object
		//ICoach theCoach = new BaseballCoach(null);
		ICoach theCoachH = new HockeyCoach();
		//ICoach theCoachT = new TrackCoach();
		
		//use object
		//System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoachH.getDailyWorkout());
		//System.out.println(theCoachT.getDailyWorkout());
		
	}

}
