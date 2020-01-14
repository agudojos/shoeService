package com.adidas.shoes.dao;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.CrudRepository;

import com.adidas.shoes.model.Shoe;

@JaversSpringDataAuditable
public interface ShoeRepository extends CrudRepository<Shoe, Long> {


}
