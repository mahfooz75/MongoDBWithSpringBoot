package com.example.entity;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ratecard")
public class Ratecard {
  @Id
  private String id;
  
  private String name;
  private LocalDate startDate;
  private LocalDate endDate;
  private String platform;
  private String templateId;
  private List<PlanClass> planClass;
  private List<CommercialGroup> commercialGroupAndType;
}
