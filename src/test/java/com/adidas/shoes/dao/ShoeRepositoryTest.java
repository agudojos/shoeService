package com.adidas.shoes.dao;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import com.adidas.shoes.model.Model;

@RunWith(SpringRunner.class)
@DataJpaTest
@TestPropertySource(properties = {
    "spring.test.database.replace=none"
})
public class ShoeRepositoryTest {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private ShoeRepository shoeRepository;


  @Autowired
  private ModelRepository modelRepository;

  @Test
  public void test() {
    List<Model> lst = new ArrayList<>();
    modelRepository.findAll().iterator().forEachRemaining(lst::add);
    Assert.assertThat(lst, Matchers.hasSize(2));
  }

}