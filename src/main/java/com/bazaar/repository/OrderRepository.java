package com.bazaar.repository;

import org.springframework.data.repository.CrudRepository;

import com.bazaar.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Long>{

}
