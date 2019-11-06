package com.adidas.shoes.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "models")
public class Model {

  @Id
  @Column(name = "model_Id")
  private Long id;


}
