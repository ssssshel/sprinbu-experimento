package com.monolith.demo.monolith_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monolith.demo.monolith_demo.model.StudentCourseModel;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourseModel, Long> {
  StudentCourseModel findByIdStudent(Long id);
}
