package com.monolith.demo.monolith_demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.monolith.demo.monolith_demo.dto.ResponseDto;
import com.monolith.demo.monolith_demo.dto.StudentDto;
import com.monolith.demo.monolith_demo.model.StudentModel;
import com.monolith.demo.monolith_demo.repository.StudentRepository;
import com.monolith.demo.monolith_demo.service.inter.StudentServiceInter;
import com.monolith.demo.monolith_demo.shared.Constants;
import com.monolith.demo.monolith_demo.shared.Utils;

@Service
public class StudentService implements StudentServiceInter {

  @Autowired
  private StudentRepository studentRepository;

  @Override
  public ResponseDto getAllStudents() {
    try {
      List<StudentModel> listStudentModels = studentRepository.findAll();
      if (listStudentModels.isEmpty()) {
        return Utils.getResponse(false, HttpStatus.NOT_FOUND.value(), Constants.NOT_FOUND, null);
      }

      List<StudentDto> response = new ArrayList<StudentDto>();
      for (StudentModel studentObject : listStudentModels) {
        response.add(StudentDto.builder()
            .id_student(studentObject.getId())
            .name(studentObject.getName())
            .surname(studentObject.getSurname())
            .gender(studentObject.getGender())
            .state(studentObject.getState())
            .build());
      }
      return Utils.getResponse(true, HttpStatus.OK.value(), Constants.OPERATION_SUCCESS, response);
    } catch (Exception e) {
      return Utils.getResponse(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), Constants.OPERATION_FAILED,
          e.getMessage());
    }
  }

  @Override
  public ResponseDto getStudentById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseDto createStudent(StudentDto student) {
    try {
      StudentModel studentModel = StudentModel.builder()
          .name(student.getName())
          .surname(student.getSurname())
          .gender(student.getGender())
          .state(student.getState())
          .build();

      studentRepository.save(studentModel);
      student.setId_student(studentModel.getId());
      return Utils.getResponse(true, HttpStatus.CREATED.value(), Constants.OPERATION_SUCCESS, student);
    } catch (Exception e) {
      return Utils.getResponse(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), Constants.OPERATION_FAILED,
          e.getMessage());
    }
  }
}
