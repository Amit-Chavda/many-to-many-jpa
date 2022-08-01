package com.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRespository extends JpaRepository<Student, Long>{

}
