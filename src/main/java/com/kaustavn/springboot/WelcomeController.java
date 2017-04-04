package com.kaustavn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	//Dependency
    //private WelcomeService service = new WelcomeService();
	
	//Auto wiring: spring creates the bean beforehand and injects them whenever needed
	@Autowired
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
}


//@component or @service: spring to manage this bean and create an instance of this
//component looks by default in packages where @SpringBootApplication is defined
//use ComponentScan to change default settings for searching components
@Component
class WelcomeService {

	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning sunny374";
	}
}