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
import com.cts.shoppingapp.seller.model.UserModel;
import com.cts.shoppingapp.seller.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController	
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public UserModel saveUser(@RequestBody UserModel userModel) {
		log.info("Inside save User");
		return userService.saveUser(userModel);
	}
	
	@GetMapping("/getuser")
	public List<UserModel> getUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUserById/{userId}")
	public ResponseEntity<UserModel> getUserById(@PathVariable long userId){
		log.info("Userid: {}",userId);
		UserModel user = userService.getUserById(userId);
		System.out.println(user);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@GetMapping("/getCourseById/{userId}")
	public ResponseEntity<List<CourseModel>> getCourseById(@PathVariable long userId){
		log.info("Userid: {}",userId);
		List<CourseModel> courseList = userService.getUserCourse(userId);
		return ResponseEntity.ok(courseList);
		}
	
	
}
