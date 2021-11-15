package com.cyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET )
	public String testGET( ) {
		System.out.println("success from GET!!");
		return "success";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST )
	public String testPOST(@RequestParam(value="username", required=false, defaultValue="Alan")String username, String password, String age) {
		System.out.println("success from POST !!");
		System.out.println("username= " + username + "password= " + password );
		return "success";
	}
    
	@RequestMapping(value="/test1", method=RequestMethod.GET )
	public String testGET2(@CookieValue(value="JSESSIONID") String sessionID ) {
		System.out.println("success from get2 !!");
		System.out.println("session id = " + sessionID );
		return "success";
	}
}
