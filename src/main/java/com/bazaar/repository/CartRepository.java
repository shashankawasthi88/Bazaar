package com.bazaar.repository;

import org.springframework.data.repository.CrudRepository;

import com.bazaar.entity.CartEntity;


public interface CartRepository extends CrudRepository<CartEntity, Long> {

}
