package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerappApplication 
{
	@GetMapping("/")
	public String home()
	{
		return "Simple spring application with docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerappApplication.class, args);
	}

}
