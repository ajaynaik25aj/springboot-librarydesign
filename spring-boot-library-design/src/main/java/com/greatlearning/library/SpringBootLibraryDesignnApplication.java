 package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignnApplication.class, args);
		System.out.println("hello");
		System.out.println("hello dev tools");

	}

	@Override
	public void run(String... args) throws Exception {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Desigining microservice with Spring Boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstructorName("Samarth narulla");
	    System.out.println("Great learning" + greatLearning);

	}

}
