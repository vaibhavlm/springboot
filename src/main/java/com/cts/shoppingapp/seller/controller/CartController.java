package com.cts.shoppingapp.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.shoppingapp.seller.model.CartModel;
import com.cts.shoppingapp.seller.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/")
	public ResponseEntity<CartModel> createCart(@RequestBody CartModel cart){
		return ResponseEntity.ok(cartService.createCart(cart));
	}
}
