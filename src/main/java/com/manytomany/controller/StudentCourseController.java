package com.manytomany.controller;

import com.manytomany.entity.Student;
import com.manytomany.entity.StudentsCourses;
import com.manytomany.repository.StudentsCoursesRepository;
import com.manytomany.service.StudentCourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCourseController {

    private StudentCourseService studentCourseService;
    private StudentsCoursesRepository studentsCoursesRepository;

    public StudentCourseController(StudentCourseService studentCourseService, StudentsCoursesRepository studentsCoursesRepository) {
        this.studentCourseService = studentCourseService;
        this.studentsCoursesRepository = studentsCoursesRepository;
    }


    @PostMapping("/student/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentCourseService.saveStudent(student);
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
