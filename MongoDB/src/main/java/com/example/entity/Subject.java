package com.example.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
  @Field(name = "subject_name")
  private String subjectName;

  @Field(name = "marks_obtained")
  private int marksObtained;
}
