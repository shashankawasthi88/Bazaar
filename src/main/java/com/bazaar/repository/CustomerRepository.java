package com.bazaar.repository;

import org.springframework.data.repository.CrudRepository;

import com.bazaar.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity,Long> {

}
