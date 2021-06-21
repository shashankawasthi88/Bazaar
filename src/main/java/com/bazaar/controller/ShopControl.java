package com.bazaar.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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

import com.bazaar.entity.ItemEntity;
import com.bazaar.entity.ShopEntity;
import com.bazaar.model.Item;
import com.bazaar.model.Shop;
import com.bazaar.repository.ItemRepository;
import com.bazaar.repository.ShopRepository;

@RestController
@Component
public class ShopControl {

	@Autowired
	ShopRepository shopRepository;

	@Autowired
	ItemRepository itemRepository;

	@GetMapping("/shop/{id}")
	public Shop getShop(@PathVariable Long id) {
		Shop shop = new Shop();

		Optional<ShopEntity> option = shopRepository.findById(id);

		System.out.println("ShopEntity " + option);

		ShopEntity shopEntity;

		// Shop shop = new Shop();
		if (option.isPresent()) {
			shopEntity = option.get();
			shop.setId(shopEntity.getId());
			shop.setName(shopEntity.getName());
			List<Item> items = new ArrayList<Item>();
			for (ItemEntity itemEntity : shopEntity.getItems()) {
				Item item = new Item();
				item.setId(itemEntity.getId());
				item.setName(itemEntity.getName());
				items.add(item);
			}

			shop.setItemList(items);

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

		ItemEntity itemEntity;
		Set<ItemEntity> itemEntities = new HashSet<ItemEntity>();

		for (Item item : shop.getItemList()) {
			itemEntity = new ItemEntity();
			itemEntity.setName(item.getName());
			itemEntity.setShop(shopEntity);
			itemEntities.add(itemEntity);

		}

		// shopEntity.setItems(items);
		shopRepository.save(shopEntity);
		itemRepository.saveAll(itemEntities);
		System.out.println("Created");

		return shopEntity.getId();

	}

	@PutMapping("/shop/{id}")
	public Long updateShop(@PathVariable Long id, @RequestBody Shop shop) {
		Optional<ShopEntity> option = shopRepository.findById(id);
		ShopEntity shopEntity;
		if (option.isPresent()) {
			shopEntity = option.get();
			shopEntity.setName(shop.getName());
			shopRepository.save(shopEntity);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found");
		}

		return shopEntity.getId();

	}
}
