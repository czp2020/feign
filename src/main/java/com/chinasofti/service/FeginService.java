package com.chinasofti.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="client",fallback = FeignServiceHystric.class)//fallback指定熔断类
public interface FeginService {
	
	@RequestMapping("/findUser")
	String findUser(@RequestParam("username")String username);

}
