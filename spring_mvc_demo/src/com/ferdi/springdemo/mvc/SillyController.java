package com.ferdi.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/hello") //this is main so oher maps are relative
public class SillyController {

	@RequestMapping("/showForm")//if I use this mapping two different class then the program can ambigius.How can we Solve this problem?
	public String displayTheForm() {
		return "silly";
	}
	
}

		
