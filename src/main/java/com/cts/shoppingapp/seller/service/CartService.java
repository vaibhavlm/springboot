package com.cts.shoppingapp.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.shoppingapp.seller.model.CartModel;
import com.cts.shoppingapp.seller.repository.CartRepo;

@Service
public class CartService {
	
	@Autowired
	private CartRepo cartRepo;

	public  CartModel createCart(CartModel cart) {
	
		return cartRepo.save(cart);
	}

}
