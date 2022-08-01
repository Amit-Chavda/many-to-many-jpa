package com.manytomany.service;

import com.manytomany.entity.Course;
import com.manytomany.entity.Student;
import com.manytomany.repository.CourseRepository;
import com.manytomany.repository.StudentRespository;
import org.springframework.stereotype.Service;

@Service
public class StudentCourseService {

    private StudentRespository studentRespository;

    private CourseRepository courseRepository;

    public StudentCourseService(StudentRespository studentRespository, CourseRepository courseRepository) {
        this.studentRespository = studentRespository;
        this.courseRepository = courseRepository;
    }

    public Student saveStudent(Student student){
        return studentRespository.save(student);
    }

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }



}
