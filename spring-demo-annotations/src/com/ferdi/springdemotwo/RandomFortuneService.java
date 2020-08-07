package com.ferdi.springdemotwo;

import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements IFortuneService{

	@Override 
	public String getFortune() {
		// TODO Auto-generated method stub
		System.out.println("Enter a random number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number >= 20) {
			return "Today is your luck day!";
		}
		else {
			return "Today is not your lucky day!";
		}
		
	}

}
