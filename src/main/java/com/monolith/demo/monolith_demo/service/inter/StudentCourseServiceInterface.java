package com.monolith.demo.monolith_demo.service.inter;

import java.util.List;

import com.monolith.demo.monolith_demo.dto.StudentCourseDto;

public interface StudentCourseServiceInterface {
  public List<StudentCourseDto> getAllStudentCourse();

  public StudentCourseDto getStudentCourseById(Long id);
}
