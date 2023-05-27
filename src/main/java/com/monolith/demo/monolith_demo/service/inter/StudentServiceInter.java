package com.monolith.demo.monolith_demo.service.inter;

import com.monolith.demo.monolith_demo.dto.ResponseDto;
import com.monolith.demo.monolith_demo.dto.StudentDto;

public interface StudentServiceInter {
  public ResponseDto getAllStudents();

  public ResponseDto getStudentById(Long id);

  public ResponseDto createStudent(StudentDto student);
}
