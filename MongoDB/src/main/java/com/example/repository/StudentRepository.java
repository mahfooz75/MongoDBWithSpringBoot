package com.example.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
  
  List<Student> findByName(String name);

  List<Student> findByNameAndEmail(String name, String email);
  
  List<Student> findByNameOrEmail(String name, String email);
  
  List<Student> findByEmailIsLike(String email);
  
  List<Student> findByNameStartsWith(String name);
  
  List<Student> findByDepartmentId(String deptId);
  
  List<Student> findBySubjectsId(String subId);
  
  @Query("{ \"name\" : \"?0\" }") // ?0 replace first argument
  List<Student> getByName(String name);
  
  @Query("{ \"name\" : \"?0\", \"mail\" : \"?1\" }")
  List<Student> getByNameAndEmail(String name, String email);

}
