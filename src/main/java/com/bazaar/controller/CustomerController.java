package com.bazaar.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bazaar.model.Customer;

@RestController
@Component
public class CustomerController {
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable long id)
	{
		return null;
	}
	
	@PostMapping("/customer/")
	public long createCustomer(@RequestBody Customer customer)
	{
		return 1;
	}
	
	
	@PutMapping("/customer/")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return null;
	}
	
	@DeleteMapping("/customer/{id}")
	public long deleteCustomer(@PathVariable long id)
	{
		return 1;
	}	

}
