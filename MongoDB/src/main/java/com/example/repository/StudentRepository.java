package com.example.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
  List<Student> findByName(String name);

  List<Student> findByNameAndEmail(String name, String email);

}
