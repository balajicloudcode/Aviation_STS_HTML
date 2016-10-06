package com.aviation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AviationViewController {

	
	@RequestMapping("/")
	public String ViewPage(){
		System.out.println("Hi");
		return "index.html";
	}
	
	

	
	
}
