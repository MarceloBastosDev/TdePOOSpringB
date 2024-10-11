package com.example.AulaPOO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class AulaPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaPooApplication.class, args);


	}
	@GetMapping("/inicio")
	public List<String> inicio() {
		return Arrays.asList("1", "2", "3", "4", "5");
	}

}
