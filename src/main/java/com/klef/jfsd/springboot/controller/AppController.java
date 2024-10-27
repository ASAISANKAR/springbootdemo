package com.klef.jfsd.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public String home()
	{
		return "Hello this is SS.....!!!!!";
	}
}
