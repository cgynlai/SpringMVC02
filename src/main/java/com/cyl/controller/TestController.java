package com.cyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET )
	public String testGET( ) {
		System.out.println("success from GET!!");
		return "success";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST )
	public String testPOST(String username, String password, String age) {
		System.out.println("success from POST !!");
		System.out.println("username= " + username + "password= " + password );
		return "success";
	}

}
