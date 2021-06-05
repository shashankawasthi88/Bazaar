package com.bazaar.repository;

import org.springframework.data.repository.CrudRepository;

import com.bazaar.entity.ShopEntity;

public interface ShopRepository extends CrudRepository<ShopEntity, Long> {

}
