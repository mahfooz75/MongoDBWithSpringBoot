package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.entity.Ratecard;

public interface RatecardRepository extends MongoRepository<Ratecard, String>{
}
