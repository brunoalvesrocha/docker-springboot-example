package me.bruno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootExampleApplication.class, args);
	}

	@GetMapping("hi")
	String hi() {
		return "hii spring";
	}
}
