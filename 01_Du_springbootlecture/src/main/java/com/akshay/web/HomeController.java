package com.akshay.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	
	@RequestMapping("/home")
	public String home() {
	System.out.println("this is home page ");
	return "home";
	}

	@RequestMapping("/contect")
	public String contect() {
	System.out.println("this is contect page ");
	return "contect";
	}
}
