package com.cts.shoppingapp.seller.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	private String courseTitle;
	private String courseCreator;
	private String courseDescription;
	private String tags;
	private int price;
	private int discount;
	private String discountValid;
	//private long user_id;
	
}
