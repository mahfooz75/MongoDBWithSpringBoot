package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

  public List<Student> getStudentByNameAndMail(String name, String email) {
    return studentRepository.findByNameAndEmail(name, email);
  }

  public List<Student> getStudentByNameOrMail(String name, String email) {
    return studentRepository.findByNameOrEmail(name, email);
  }

  public List<Student> getAllWithPagination(int pageNo, int pageSize) {
    Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
    return studentRepository.findAll(pageable).getContent();
  }

  public List<Student> getAllWithSorting() {
    Sort sort = Sort.by(Sort.Direction.ASC, "name");
    return studentRepository.findAll(sort);
  }

  public List<Student> getAllWithSorting(String field) {
    Sort sort = Sort.by(Sort.Direction.ASC, field);
    return studentRepository.findAll(sort);
  }

  public List<Student> getByDepartmentName(String deptname) {
    return studentRepository.findByDepartmentDepartmentName(deptname);
  }

  public List<Student> getBySubjectName(String subName) {
    return studentRepository.findBySubjectsSubjectName(subName);
  }

}
