package com.ferdi.springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//Define a Annotation
	
	public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
		
		private String coursePrefix;
		
		
		@Override
		public void initialize(CourseCode theCourseCode) {
			// TODO Auto-generated method stub
			coursePrefix = theCourseCode.value();
		}


		@Override
		public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
			
			boolean result;
			if(theCode != null) {
				result = theCode.startsWith(coursePrefix);
			}
			else {
				result = true;
			}
			return result;
		}
		
	}
	//by using below code snipped I can control my required place.
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	@RequestMapping("showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,BindingResult theBindingResult
			) {
		
					if(theBindingResult.hasErrors()) {
						return "customer-form";
					}
					else {
						return "customer-confirmation";
					}
 	}


}
