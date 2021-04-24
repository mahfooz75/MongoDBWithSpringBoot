package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @PostMapping("/create")
  public Student createStudent(@RequestBody Student student) {
    return studentService.createStudent(student);
  }

  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable String id) {
    return studentService.getStudentById(id);
  }

  @GetMapping("/all")
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }

  @GetMapping("/name/{name}")
  public List<Student> getStudentByName(@PathVariable String name) {
    return studentService.getStudentByName(name);
  }

  @GetMapping("/studentByNameAndMail")
  public ResponseEntity<?> getStudentByNameAndMail(@RequestParam String name,
      @RequestParam String email) {
    List<Student> students = studentService.getStudentByNameAndMail(name, email);
    if(students!=null && students.isEmpty()) {
      return new ResponseEntity<String>("Data Not Found", HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
  }
  
  @GetMapping("/studentByNameOrMail")
  public ResponseEntity<?> getStudentByNameOrMail(@RequestParam String name,
      @RequestParam String email) {
    List<Student> students = studentService.getStudentByNameOrMail(name, email);
    if(students!=null && students.isEmpty()) {
      return new ResponseEntity<String>("Data Not Found", HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
  }

  @PutMapping("/update")
  public Student updateStudent(@RequestBody Student student) {
    return studentService.updateStudent(student);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteStudent(@PathVariable String id) {
    return studentService.deleteStudent(id);
  }

}
