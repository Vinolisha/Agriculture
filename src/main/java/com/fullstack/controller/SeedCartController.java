package com.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fullstack.model.SeedCart;

import com.fullstack.service.SeedCartService;

public class SeedCartController {
	@Autowired
	SeedCartService service;

	@PostMapping("/addSeedCart")
	public ResponseEntity<String> insertCart(@RequestBody SeedCart cart) {

		if (service.validateCart(cart)) {

			return ResponseEntity.badRequest().body("item already added");

		} else {
			service.insertCart(cart);
			return ResponseEntity.ok("added");
		}

	}
	
}
