package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Ratecard;
import com.example.repository.RatecardRepository;

@Service
public class RatecardService {

  @Autowired
  private RatecardRepository ratecardRepository;
  
  public Ratecard createRatecard(Ratecard ratecard) {
    return ratecardRepository.save(ratecard);
  }

}
