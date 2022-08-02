package com.manytomany;

import com.manytomany.entity.Course;
import com.manytomany.entity.Student;
import com.manytomany.entity.StudentsCourses;
import com.manytomany.repository.StudentRespository;
import com.manytomany.repository.StudentsCoursesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class ManyToManyJPAApplication {


    private StudentsCoursesRepository studentsCoursesRepository;

    public ManyToManyJPAApplication(StudentsCoursesRepository studentsCoursesRepository) {
        this.studentsCoursesRepository = studentsCoursesRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyJPAApplication.class, args);
    }


    @PostConstruct
    public void run1() {
        Student student = new Student();
        student.setName("Kevin");


        Course course = new Course();
        course.setName("Civil");


        StudentsCourses studentsCourses = new StudentsCourses();
        studentsCourses.setStudent(student);
        studentsCourses.setCourse(course);
        studentsCourses.setOtherFields("Others");

        studentsCoursesRepository.save(studentsCourses);


        /*course.getStudentsCourses().add(studentsCourses);
        student.getStudentsCourses().add(studentsCourses);
        studentRespository.save(student);*/

    }
}
