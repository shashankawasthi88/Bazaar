/**
 * 
 */
package com.bazaar.controller;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bazaar.entity.CustomerEntity;
import com.bazaar.model.Customer;
import com.bazaar.model.Item;
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

	@GetMapping("/item/{id}")
	public Item getItem(@PathParam(value = "id") String id) {

		Item item = new Item();
		item.setId(1L);
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
		customer.setId(1L);
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
