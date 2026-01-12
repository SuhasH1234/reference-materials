package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.Course;
import com.org.service.CourseService;

@RestController
public class CourseRESTController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/courses")
	public ResponseEntity<String> createCourse(@RequestBody Course course) {
		System.out.println("Received: " + course);  // Add this
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/courses/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid) {
		Course course = courseService.getById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Course>> handleDefaultCourseGet() {
	    return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
	}
	
	@PutMapping("/courses")
	public ResponseEntity<String> updateCourse(@RequestBody Course course) {
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@DeleteMapping("/courses/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid) {
	    String status = courseService.deleteById(cid);
	    return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
