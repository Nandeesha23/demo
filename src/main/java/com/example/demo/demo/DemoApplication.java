package com.example.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
@GetMapping("/hello-world")
public String HelloWorld(){
return "Hello World";
}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}