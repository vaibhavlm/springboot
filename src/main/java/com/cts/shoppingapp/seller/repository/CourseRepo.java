package com.cts.shoppingapp.seller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.shoppingapp.seller.model.CourseModel;

public interface CourseRepo extends JpaRepository<CourseModel, Long> {

	@Query(value =  "Select * from course_model Where uc_pk = :user_id" , nativeQuery = true)
	 List<CourseModel> getCoursesByUserId(@Param("user_id")long user_id);
}
