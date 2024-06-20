package com.jenkins.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JenkinsController {
	
	@GetMapping("/get-page")
	public String m1() {
		return "2929929" ; 
	}

	@GetMapping("/get-pages")
	public String m2() {
		return "2929929j" ; 
	}

	
	@GetMapping("/get-pages")
	public String m2() {
		return "2929929j" ; 
	}

		
	@GetMapping("/get-pages")
	public String m2() {
		return "2929929j" ; 
	}

		@GetMapping("/get-papage")
        public String m4(){
		System.out.print("this is working");
		return "29292929"; 
	}
}
