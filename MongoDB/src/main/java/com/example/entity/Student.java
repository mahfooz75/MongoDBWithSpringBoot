package com.example.entity;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "student")
public class Student {

  @Id
  private String id;

  // IF MONGODB FIELD NAME AND JAVA POJO ATTRIBUTE NAME IS SAME THEN @FIELD CAN BE REMOVED
  // @Field(name = "name")
  private String name;

  @Field(name = "mail")
  private String email;

  @DBRef
  private Department department;

  @DBRef
  private List<Subject> subjects;

}
