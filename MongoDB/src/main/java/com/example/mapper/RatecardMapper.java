package com.example.mapper;

import org.mapstruct.Mapper;
import com.example.entity.Ratecard;
import com.example.entity.RatecardRequest;

@Mapper
public interface RatecardMapper {
  RatecardRequest ratecardToRatecardRequest(Ratecard ratecard);
  
  Ratecard ratecardRequestToRatecard(RatecardRequest request);
}
