package com.cts.shoppingapp.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.shoppingapp.seller.model.CourseModel;
import com.cts.shoppingapp.seller.service.CourseService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/")
	public CourseModel addCourse(@RequestBody CourseModel course) {
		log.info("Inside method add course");
		return courseService.addCourse(course);
	}
	
	@GetMapping("/getcourse")
	public List<CourseModel> getCourses(){
		log.info("Inside method get all courses");
		return courseService.getCourses();
	}
	
	@GetMapping(value = "/getcoursebyid/{courseId}")
	public ResponseEntity<CourseModel> getCourseById(@PathVariable long courseId) {
		log.info("Inside method get course by courseId: {}", courseId);
		CourseModel course =  courseService.getCourseById(courseId);
		return new ResponseEntity<>(course,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getcoursebyuserid/{userId}")
	public ResponseEntity<List<CourseModel>> getCourseByUserId(@PathVariable long userId){
		log.info("Inside method get course by userId: {}", userId);
		List<CourseModel> courses = courseService.getCourseByUserId(userId);
		return ResponseEntity.ok(courses);
	}
}
