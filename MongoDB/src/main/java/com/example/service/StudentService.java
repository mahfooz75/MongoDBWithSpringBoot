package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;

  public Student createStudent(Student student) {
    return studentRepository.save(student);
  }

  public Student getStudentById(String id) {
    return studentRepository.findById(id).get();
  }

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public Student updateStudent(Student student) {
    return studentRepository.save(student);
  }

  public String deleteStudent(String id) {
    studentRepository.deleteById(id);
    return "Student with id:: " + id + " has been deleted!!!";
  }

  public List<Student> getStudentByName(String name) {
    return studentRepository.findByName(name);
  }

}
