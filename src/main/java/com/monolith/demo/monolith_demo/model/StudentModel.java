package com.monolith.demo.monolith_demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "students", schema = "tests")
@IdClass(StudentModel.class)
public class StudentModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "gender")
  private String gender;

  @Column(name = "state")
  private Boolean state;

  @JoinColumn(name = "id", referencedColumnName = "id_student")
  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
  private StudentCourseModel studentCourseModel;
}