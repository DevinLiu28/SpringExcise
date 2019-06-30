package com.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mp.dao")
public class ApplicationController {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationController.class, args);
	}

}
