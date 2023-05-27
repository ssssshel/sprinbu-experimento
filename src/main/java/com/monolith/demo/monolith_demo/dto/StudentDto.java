package com.monolith.demo.monolith_demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {
  private Long id_student;
  private String name;
  private String surname;
  private String gender;
  private Boolean state;
}
