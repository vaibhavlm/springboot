package com.cts.shoppingapp.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.shoppingapp.seller.model.CourseModel;
import com.cts.shoppingapp.seller.repository.CourseRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;

	public CourseModel addCourse(CourseModel course) {
		return courseRepo.save(course);
	}

	public List<CourseModel> getCourses() {
		return courseRepo.findAll();
	}

	public CourseModel getCourseById(long courseId) {
		log.info("Inside course service get course by id method : {}", courseId);
		CourseModel course = courseRepo.findById(courseId).get();
		return course;
	}

	public List<CourseModel> getCourseByUserId(long user_id) {
		return courseRepo.getCoursesByUserId(user_id);
	}

}
