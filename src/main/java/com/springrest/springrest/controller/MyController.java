package com.springrest.springrest.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	//get the courses
	@GetMapping("/load")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/load/{shipperId}")
	public Course getCourse(@PathVariable String shipperId) {
		return this.courseService.getCourse(Long.parseLong(shipperId));
	}
	
	@PostMapping("/load")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	@DeleteMapping("/load/{shipperId}")
	public Course delCourse(@PathVariable String shipperId) {
		return this.courseService.delCourse(Long.parseLong(shipperId));
	}
}
