package com.chinasofti.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeginService{

	@Override
	public String findUser(String username) {
		// TODO Auto-generated method stub
		return "对不起 又断了"+username;
	}

}
