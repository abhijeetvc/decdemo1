package com.firstdec.decdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Decdemo1Application {

	public static void main(String[] args) {
		System.out.println("hello Spring");
		SpringApplication.run(Decdemo1Application.class, args);
	}
}
