package com.example.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialGroup {

  @JsonProperty("id")
  private String id;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("commercialType")
  private List<CommercialType> commercialType;
}
