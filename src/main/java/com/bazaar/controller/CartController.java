package com.bazaar.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bazaar.model.Cart;

@RestController
@Component
public class CartController {
	
	
	@PostMapping("/customer/{id}/cart")
	public long addCart(@PathVariable long id,Cart cart)
	{
		return 1;
	}

}
