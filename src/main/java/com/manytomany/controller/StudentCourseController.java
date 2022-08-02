package com.manytomany.controller;

import com.manytomany.entity.Course;
import com.manytomany.entity.Student;
import com.manytomany.entity.StudentsCourses;
import com.manytomany.repository.CourseRepository;
import com.manytomany.repository.StudentRespository;
import com.manytomany.repository.StudentsCoursesRepository;
import com.manytomany.service.StudentCourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCourseController {

    private CourseRepository courseRepository;
    private StudentRespository studentRespository;
    private StudentsCoursesRepository studentsCoursesRepository;

    public StudentCourseController(CourseRepository studentCourseService, StudentRespository studentRespository, StudentsCoursesRepository studentsCoursesRepository) {
        this.courseRepository = studentCourseService;
        this.studentRespository = studentRespository;
        this.studentsCoursesRepository = studentsCoursesRepository;
    }

    @PostMapping("/student/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentRespository.save(student);
    }
    @GetMapping("/student/findAll")
    public List<Student> findAllStudents() {
        return studentRespository.findAll();
    }

    @PostMapping("/course/save")
    public Course saveStudent(@RequestBody Course course) {
        return courseRepository.save(course);
    }
    @GetMapping("/course/findAll")
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }


    @PostMapping("/sc/save")
    public StudentsCourses scSave(@RequestBody StudentsCourses studentsCourses) {
        return studentsCoursesRepository.save(studentsCourses);
    }

    @GetMapping("/findAll")
    public List<StudentsCourses> findAll() {
        return studentsCoursesRepository.findAll();
    }


}
