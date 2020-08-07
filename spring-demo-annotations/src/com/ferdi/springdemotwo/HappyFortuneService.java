package com.ferdi.springdemotwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	@Override 
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}

}
