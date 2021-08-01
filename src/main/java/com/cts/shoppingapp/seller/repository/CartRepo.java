package com.cts.shoppingapp.seller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.shoppingapp.seller.model.CartModel;

public interface CartRepo extends JpaRepository<CartModel, Long> {

}
