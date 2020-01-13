package com.adidas.shoes.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "models")
@Audited
public class Model {

  @Id
  @Column(name = "model_Id")
  private Long id;

  @Column(name = "created_date", nullable = false, updatable = false)
  @CreatedDate
  private long createdDate;

  @Column(name = "last_updated_date", nullable = false, updatable = true)
  @LastModifiedDate
  private long updatedDate;


}
