package com.adidas.shoes.dao;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.CrudRepository;

import com.adidas.shoes.model.Model;

@JaversSpringDataAuditable
public interface ModelRepository extends CrudRepository<Model, Long> {

}
