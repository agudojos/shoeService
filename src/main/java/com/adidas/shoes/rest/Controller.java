package com.adidas.shoes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adidas.shoes.dao.ModelRepository;
import com.adidas.shoes.dao.ShoeRepository;
import com.adidas.shoes.model.Model;
import com.adidas.shoes.model.Shoe;

@RestController
public class Controller {

  @Autowired
  ModelRepository modelRepository;

  @Autowired
  ShoeRepository shoeRepository;

  @RequestMapping(value = "/model", method = RequestMethod.GET)
  public String model() {

      Model m = new Model();
      m.setId(1l);
      modelRepository.save(m);
      return "//model";
  }

  @RequestMapping(value = "/shoe", method = RequestMethod.GET)
  public String shoe() {

    Model m = modelRepository.findById(1l).get();

    Shoe s = new Shoe();
    s.setColor("red");
    s.setId(1l);
    s.setModel(m);

    shoeRepository.save(s);

    s.setColor("blue");
    shoeRepository.save(s);

    shoeRepository.delete(s);

    return "//shoe";
  }

  public String revision(int revision){

  }

}
