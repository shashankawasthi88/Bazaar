/**
 * 
 */
package com.bazaar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bazaar.entity.CustomerEntity;
import com.bazaar.modal.Customer;
import com.bazaar.modal.Item;
import com.bazaar.repository.CustomerRepository;



/**
 * @author shashankawasthi
 *
 */
@RestController
@Component
public class DemoService {

	@Autowired
	private CustomerRepository customerRepository;

	
	@GetMapping("/item")
	public Item getItem() {

		Item item = new Item();
		item.setId("1");
		item.setImageURL("URL");
		item.setMeasurementUnit("kg");
		item.setName("Dal");
		item.setUnitPrice(60);
		return item;
	}

	
	@GetMapping("/getCustomerObject")
	public Customer getCustomerObject() {

		Customer customer = new Customer();
		customer.setAddress("AA");
		customer.setId("123");
		Map<String, String> stringMap = new HashMap();
		stringMap.put("1", "ABC");
		customer.setAddresses(stringMap);

		return customer;
	}

	
	@PostMapping("/createcustomer")
	public void createCustomer(@RequestBody Customer customer) {

		System.out.println("Customer ID:" + customer.getId() + "Customer Address" + customer.getAddress());

		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setAddress(customer.getAddress());
		customerEntity.setName(customer.getName());
		customerRepository.save(customerEntity);

		return;

	}

}
