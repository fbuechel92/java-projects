package com.fb.simpleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleApiApplication {

	private hotel hotel = new hotel();

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

	@GetMapping("/roominfo")
	public String roominfo(){
		return String.format("Currently there are %d rooms in the hotel.", hotel.getRoomnum());
	}
}
