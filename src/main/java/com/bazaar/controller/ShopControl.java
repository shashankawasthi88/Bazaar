package com.bazaar.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bazaar.entity.ShopEntity;
import com.bazaar.modal.Shop;
import com.bazaar.repository.ShopRepository;

@RestController
@Component
public class ShopControl {
	
	@Autowired
	ShopRepository repository;
	
	
	
	@GetMapping("/shop/{id}")
	public Shop getShop(@PathVariable Long id)
	{
		 Shop shop = new Shop();
	
		
		Optional<ShopEntity> option = repository.findById(id);		 
		
		System.out.println("ShopEntity " + option);
		
		ShopEntity entity = option.get();
		 
		// Shop shop = new Shop();
		 shop.setId(entity.getId().toString());
		 shop.setName(entity.getName());
		 return shop;
	}
	
	
	@PostMapping("/shop")
	public void createShop(@RequestBody Shop shop)
	{
		
		System.out.println("Shop " + shop);
		
		ShopEntity shopEntity = new ShopEntity();
		
		//shopEntity.setId(shop.getId())
		shopEntity.setName(shop.getName());
		
		repository.save(shopEntity);
		System.out.println("Created");
	
		
	}
}
