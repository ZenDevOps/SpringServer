package com.example.helloserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class HelloResource {

	@RequestMapping("/rest/hello/server/affordablehealthcare")
	  @GetMapping 
	  public String affordablehealthcare() { 
		  return "Affordable health care service started"; 
		  }
	 
	@RequestMapping("/rest/hello/server/childeducation")
	  @GetMapping 
	  public String childeducation() { 
		  return "Child Education service started"; 
		  }
	
}
