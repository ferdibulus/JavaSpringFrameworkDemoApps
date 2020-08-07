package com.ferdi.springdemo.mvc;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.ferdi.springdemo.mvc.*;


public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Size(min=2,message ="Plase enter a grater than 3 numbers or characters")
	@CourseCode
	private String courseCode;
	
	

	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	//FirstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//LastName
	public String getLastName() { 
		return lastName; 
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;//if we use trim the ., cannot be catch from the system so we use InitBinder to solve this problem
	}
	
	

}
