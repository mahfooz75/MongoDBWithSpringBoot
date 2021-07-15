package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.CommercialGroup;
import com.example.entity.PlanClass;
import com.example.entity.Ratecard;
import com.example.service.RatecardService;

@RestController
@RequestMapping("/api/ratecard")
public class RatecardController {

  @Autowired
  private RatecardService ratecardService;

  private final MongoTemplate mongoTemplate;

  public RatecardController(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }


  @GetMapping("/all")
  public List<Ratecard> getAllRatecard(){
    return mongoTemplate.findAll(Ratecard.class);
  }
  
  @GetMapping("/planclass")
  public List<PlanClass> getPlanClass(){
    return mongoTemplate.findDistinct("planClass", Ratecard.class, PlanClass.class);
  }
  
  @GetMapping("/comtype")
  public List<CommercialGroup> getCommercialType(){
    return mongoTemplate.findDistinct("commercialGroupAndType", Ratecard.class, CommercialGroup.class);
  }

  @PostMapping("/create")
  public Ratecard createStudent(@RequestBody Ratecard ratecard) {
    return ratecardService.createRatecard(ratecard);
  }
}
