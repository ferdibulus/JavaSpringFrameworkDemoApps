package com.ferdi.springdemo.mvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/funny")  //if I use this method the url will be change and helloworld-from will be stored in /funny
@RequestMapping("/hello")
public class HelloWorldController {
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	
	//need a controller method to precess the HTML file
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new a controller method to read from data and 
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsConvert(HttpServletRequest request, Model model) {
			//read the request parameter from the HTML form
				String theName = request.getParameter("studentName");
			//convert the data to all caps
				theName = theName.toUpperCase();
			//crate message
				String result = theName;
			//add message to the model
				model.addAttribute("message", result);
	    return "helloworld";
	}
	
	//Use Bind Annotaion Paramater
	@RequestMapping("/processFormVersionThree")
	public String letsConvert( @RequestParam("studentName") String theName, Model model) {
			
		
			//convert the data to all caps
				theName = theName.toUpperCase();
			//crate message
				String result = "Hey my friend from v3 " + theName;
			//add message to the model
				model.addAttribute("message", result);
	    return "helloworld";
	}
}
