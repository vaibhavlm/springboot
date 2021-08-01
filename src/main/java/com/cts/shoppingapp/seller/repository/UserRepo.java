package com.cts.shoppingapp.seller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.shoppingapp.seller.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {

}
