package dev.bobhennessey.comcastexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ComcastExerciseApplication {

	@Autowired
	BuildProperties buildProperties;

	public static void main(String[] args) {
		SpringApplication.run(ComcastExerciseApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return String.format("hello comcast! version %s", buildProperties.getVersion());
	}

}
