package com.orient.apistructures.repository;

import com.orient.apistructures.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
