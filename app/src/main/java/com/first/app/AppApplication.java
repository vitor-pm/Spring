package com.first.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	@GetMapping("/rota1")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/rota2")
	public String rota2() {
		return "rota2";
	}

	@GetMapping("/rota3")
	public String rota3() {
		return "rota3";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
