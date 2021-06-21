package com.bazaar.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bazaar.entity.CartEntity;
import com.bazaar.entity.CartEntityStatus;
import com.bazaar.entity.CustomerEntity;
import com.bazaar.model.Cart;
import com.bazaar.repository.CartRepository;
import com.bazaar.repository.CustomerRepository;

@RestController
@Component
public class CartController {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/cart")
	public long createCart(@RequestBody Cart cart) {
		System.out.println(cart);
		CartEntity cartEntity = new CartEntity();
		cartEntity.setCartEntityStatus(CartEntityStatus.ACTIVE);
		System.out.println("customerID   "+ cart.getCustomerId());
		Optional<CustomerEntity> customerEntityOptional = customerRepository.findById(cart.getCustomerId());
		cartEntity.setCustomerEntity(customerEntityOptional.get());
		cartEntity.setItemQuantities(cart.getItemQuantityMap());

		// Map<Long, Double> returnedItemQuantityMap = new HashMap<Long, Double>();
		// cartEntity.setReturnedItemQuantities(returnedItemQuantityMap);

		cartEntity.setShopEntityId(cart.getShopId());
		cartEntity.setToalSavings(cart.getTotalSavings());
		cartEntity.setTotalPrice(cart.getTotalPrice());

		return cartRepository.save(cartEntity).getId();
	}

	@GetMapping("/cart/{cartId}")
	public Cart getCart(@PathVariable("cartId") long cartId) {
		Cart cart = new Cart();
		Optional<CartEntity> optional = cartRepository.findById(cartId);
		if (optional.isPresent()) {
			CartEntity cartEntity = optional.get();
			cart.setCustomerId(cartEntity.getCustomerEntity().getId());
			cart.setId(cartEntity.getId());
			cart.setItemQuantityMap(cartEntity.getItemQuantities());
			cart.setShopId(cartEntity.getShopEntityId());
			cart.setTotalPrice(cartEntity.getTotalPrice());
			cart.setTotalSavings(cartEntity.getToalSavings());
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found");
		}

		return cart;
	}

	@PutMapping("/cart")
	public long updateCart(@RequestBody Cart cart) {
		Optional<CartEntity> optionalCart = cartRepository.findById(cart.getId());
		if (optionalCart.isPresent()) {

			CartEntity cartEntity = optionalCart.get();
			cartEntity.setCartEntityStatus(CartEntityStatus.ACTIVE);
			cartEntity.setCustomerEntity(customerRepository.findById(cart.getCustomerId()).get());
			cartEntity.setItemQuantities(cart.getItemQuantityMap());
			// Map<Long, Double> returnedItemQuantityMap = new HashMap<Long, Double>();
			cartEntity.setShopEntityId(cart.getShopId());
			cartEntity.setToalSavings(cart.getTotalSavings());
			cartEntity.setTotalPrice(cart.getTotalPrice());

			return cartRepository.save(cartEntity).getId();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found");
		}

	}

	@DeleteMapping("/cart/{cartId}")
	public long deleteCart(@PathVariable("cartId") long cartId) {
		cartRepository.deleteById(cartId);
		return cartId;
	}
}
