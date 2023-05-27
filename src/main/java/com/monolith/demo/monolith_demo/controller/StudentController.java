package com.monolith.demo.monolith_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monolith.demo.monolith_demo.dto.ResponseDto;
import com.monolith.demo.monolith_demo.dto.StudentDto;
import com.monolith.demo.monolith_demo.service.StudentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/students")
public class StudentController {
  @Autowired
  private StudentService studentService;

  @ApiOperation(value = "Get all students", notes = "Get all students")
  @GetMapping
  public ResponseEntity<ResponseDto> getAllStudents() {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentService.getAllStudents());
  }

  @ApiOperation(value = "Get student by id", notes = "Get student by id")
  @GetMapping("/{id}")
  public ResponseEntity<ResponseDto> getStudentById(@PathVariable("id") Long id) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentService.getStudentById(id));
  }

  @ApiOperation(value = "Create student", notes = "Create student")
  @PostMapping("/create")
  public ResponseEntity<ResponseDto> createStudent(@RequestBody StudentDto student) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentService.createStudent(student));
  }
}
