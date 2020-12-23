package com.chinasofti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard //开启仪表盘
public class FeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginApplication.class, args);
	}
	
	public void show(){
	
	}

}
