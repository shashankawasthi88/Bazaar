package com.bazaar.repository;

import org.springframework.data.repository.CrudRepository;

import com.bazaar.entity.ItemEntity;

public interface ItemRepository extends CrudRepository<ItemEntity, Long>{

}
