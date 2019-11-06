package com.adidas.shoes.dao;

import org.springframework.data.repository.CrudRepository;

import com.adidas.shoes.model.Shoe;

public interface ShoeRepository extends CrudRepository<Shoe, Long> {


}
