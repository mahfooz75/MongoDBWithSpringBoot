package com.example.entity;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatecardRequest {
  private String id;
  private String name;
  private LocalDate startDate;
  private LocalDate endDate;
  private String platform;
  private String templateId;
  private List<PlanClass> planClass;
  private List<CommercialGroup> commercialGroupAndType;
  private List<Agencies> agencies;
  private List<Advertisers> advertisers;
}
