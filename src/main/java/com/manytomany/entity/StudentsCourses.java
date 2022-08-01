package com.manytomany.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_courses")
public class StudentsCourses {

    @EmbeddedId
    private StudentCourseCompositeKey studentCourseCompositeKey;
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "courses_id")
    private Course course;

    @Column(name = "others")
    private String otherFields;


    public String getOtherFields() {
        return otherFields;
    }

    public void setOtherFields(String otherFields) {
        this.otherFields = otherFields;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
