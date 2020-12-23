package com.chinasofti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.service.FeginService;



@RestController
public class FeginController {


	@Autowired
	private FeginService feginService;
	
	@RequestMapping("findUser")
	public String findUser(String username) {
		
		return feginService.findUser(username);
	}
}
