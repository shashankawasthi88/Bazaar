package com.bazaar.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bazaar.entity.ShopEntity;
import com.bazaar.model.Shop;
import com.bazaar.repository.ShopRepository;

@RestController
@Component
public class ShopControl {

	@Autowired
	ShopRepository repository;

	@GetMapping("/shop/{id}")
	public Shop getShop(@PathVariable Long id) {
		Shop shop = new Shop();

		Optional<ShopEntity> option = repository.findById(id);

		System.out.println("ShopEntity " + option);

		ShopEntity entity;

		// Shop shop = new Shop();
		if (option.isPresent()) {
			entity = option.get();
			shop.setId(entity.getId());
			shop.setName(entity.getName());

		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found");
		}
		return shop;
	}

	@PostMapping("/shop")
	public Long createShop(@RequestBody Shop shop) {

		System.out.println("Shop " + shop);

		ShopEntity shopEntity = new ShopEntity();

		// shopEntity.setId(shop.getId())
		shopEntity.setName(shop.getName());

		repository.save(shopEntity);
		System.out.println("Created");

		return shopEntity.getId();

	}

	@PutMapping("/shop/{id}")
	public Long updateShop(@PathVariable Long id, @RequestBody Shop shop) {
		Optional<ShopEntity> option = repository.findById(id);
		ShopEntity shopEntity;
		if (option.isPresent()) {
			shopEntity = option.get();
			shopEntity.setName(shop.getName());
			repository.save(shopEntity);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found");
		}

		return shopEntity.getId();

	}
}
