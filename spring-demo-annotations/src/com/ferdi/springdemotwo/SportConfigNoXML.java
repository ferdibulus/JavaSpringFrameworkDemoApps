package com.ferdi.springdemotwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
//@ComponentScan("com.ferdi.springdemotwo")//scanning this package
public class SportConfigNoXML {
	 
	//define bean for our sad fortune service
	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define bean for swim coach AND inject dependency
	@Bean
	public ICoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}
