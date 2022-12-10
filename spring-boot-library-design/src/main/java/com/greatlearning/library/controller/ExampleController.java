package com.greatlearning.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;

//@Controller
@RestController
//@RestController is a combination of @controller and @ResponseBody
public class ExampleController {

	@GetMapping("/info")
	// @ResponseBody
	// @ResponseBody and @controller can be replaed with @restcontroller
	public GreatLearning get() {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Learn spring boot in spring framework");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstructorName("Samarth narulla");
		return greatLearning;
	}

	@PostMapping("/custominfo")
	public GreatLearning custominfo(String courseName, String courseType, String instructorName) {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstructorName(instructorName);
		return greatLearning;

	}
}
