package com.kaiburr.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdApplication {
	@GetMapping("/welcome")
	public String kaiburr(){
		return "Welcome to Kaiburr!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
