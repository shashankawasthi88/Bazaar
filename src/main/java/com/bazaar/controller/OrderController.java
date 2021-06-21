package com.bazaar.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bazaar.entity.OrderEntity;
import com.bazaar.model.Order;
import com.bazaar.repository.OrderRepository;

@RestController
@Component
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/order/{orderId}")
	public Order getOrder(@PathVariable Long orderId)
	{
		Order order = new Order();
		Optional<OrderEntity> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isPresent())
		{
			OrderEntity orderEntity = optionalOrder.get();
			//order.setCartId(orderEntity.)
		}
		
		
		return order;
		
	}
	
	@PostMapping("/order")
	public long createOrder(@RequestBody Order order)
	{
		
		return 1L;
	}
	
	@PutMapping("/order")
	public long updateOrder(@RequestBody Order order)
	{
		return 1;
	}
	
	@DeleteMapping("/order/{orderId}")
	public long deleteOrder(@PathVariable Long orderId)
	{
		
		return orderId;
		
	}

}
