package com.manytomany.controller;

import com.manytomany.entity.Student;
import com.manytomany.service.StudentCourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCourseController {

    private StudentCourseService studentCourseService;

    public StudentCourseController(StudentCourseService studentCourseService) {
        this.studentCourseService = studentCourseService;
    }

    @PostMapping("/student/save")
    public Student saveStudent(@RequestBody Student student){
        return studentCourseService.saveStudent(student);
    }


}
