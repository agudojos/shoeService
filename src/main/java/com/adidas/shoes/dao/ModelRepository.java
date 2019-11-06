package com.adidas.shoes.dao;

import org.springframework.data.repository.CrudRepository;

import com.adidas.shoes.model.Model;

public interface ModelRepository extends CrudRepository<Model, Long> {

}
