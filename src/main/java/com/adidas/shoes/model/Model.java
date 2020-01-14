package com.adidas.shoes.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
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

  @Column(name = "created_date", nullable = false, updatable = false)
  @CreatedDate
  private Date createdDate;

  @Column(name = "last_updated_date", nullable = false, updatable = true)
  @LastModifiedDate
  private Date updatedDate;


}
