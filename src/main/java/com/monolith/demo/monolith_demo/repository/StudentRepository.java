package com.monolith.demo.monolith_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monolith.demo.monolith_demo.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

}
