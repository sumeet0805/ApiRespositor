package com.example.myipfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MyipfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyipfinderApplication.class, args);
	}

}