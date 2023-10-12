package com.akshay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int  a= 54;
		int b= 46;
		return "this is just  testing for dev tool "+(a+b);
		
	}
}
