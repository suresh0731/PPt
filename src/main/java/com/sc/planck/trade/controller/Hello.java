package com.sc.planck.trade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping(value="/hello")
	public String home()
	{
		return "hello World!";
	}

}
