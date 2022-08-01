package com.manytomany.repository;

import com.manytomany.entity.StudentsCourses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsCoursesRepository extends JpaRepository<StudentsCourses,Long> {
}
