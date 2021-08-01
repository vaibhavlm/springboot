package com.cts.shoppingapp.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.shoppingapp.seller.model.CourseModel;
import com.cts.shoppingapp.seller.model.UserModel;
import com.cts.shoppingapp.seller.repository.UserRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public UserModel saveUser(UserModel userModel) {
        log.info("Inside save user of userService");
		return userRepo.save(userModel);
	}

	public List<UserModel> getAllUsers() {
		return userRepo.findAll();
	}
	
	public UserModel getUserById(long userId) {
		System.out.println(userRepo.getById(userId));
		UserModel user = userRepo.findById(userId).get();
		return user;
	}

	public List<CourseModel> getUserCourse(long userId) {
		UserModel user = userRepo.getById(userId);
		return user.getCourses();
	}

}
