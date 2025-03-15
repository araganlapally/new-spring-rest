package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.HomeService;
@RestController
@RequestMapping("/hello")
public class HomeController {
	@Autowired
	private HomeService service;
	@GetMapping
	public String sayHello()
	{
		return service.hello();
	}

}
