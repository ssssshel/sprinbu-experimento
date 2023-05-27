package com.monolith.demo.monolith_demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monolith.demo.monolith_demo.dto.StudentCourseDto;
import com.monolith.demo.monolith_demo.model.StudentCourseModel;
import com.monolith.demo.monolith_demo.repository.StudentCourseRepository;
import com.monolith.demo.monolith_demo.service.inter.StudentCourseServiceInterface;

@Service
public class StudentCourseService implements StudentCourseServiceInterface {

  @Autowired
  private StudentCourseRepository studentCourseRepository;

  @Override
  public List<StudentCourseDto> getAllStudentCourse() {
    try {
      List<StudentCourseModel> listStudentCourseModels = studentCourseRepository.findAll();
      if (listStudentCourseModels.isEmpty()) {
        return null;
      }

      List<StudentCourseDto> response = new ArrayList<StudentCourseDto>();
      for (StudentCourseModel studentCourseObject : listStudentCourseModels) {
        response.add(StudentCourseDto.builder()
            .id_course(studentCourseObject.getIdCourse())
            .id_student(studentCourseObject.getIdStudent())
            .build());
      }
      return response;
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  @Override
  public StudentCourseDto getStudentCourseById(Long id) {
    try {
      StudentCourseModel studentCourseObject = studentCourseRepository.findByIdStudent(id);
      if (studentCourseObject == null) {
        return null;
      }

      return StudentCourseDto.builder()
          .id_course(studentCourseObject.getIdCourse())
          .id_student(studentCourseObject.getIdStudent())
          .build();
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return null;
    }
  }
}
