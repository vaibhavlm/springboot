package com.cts.shoppingapp.seller.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;
	private String displayName;
	private String firstName;
	private String lastName;
	private String about;
	private String interests;
	private String profession;
	private String experience;
	private String expertise;
	private String role;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "uc_pk", referencedColumnName = "user_id")
	private List<CourseModel> courses;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "cartId")
	private CartModel cart;


}
