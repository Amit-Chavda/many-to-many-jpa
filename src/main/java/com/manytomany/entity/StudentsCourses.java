package com.manytomany.entity;

import javax.persistence.*;

@Entity
public class StudentsCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;

    

    @ManyToOne(targetEntity = Course.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id",referencedColumnName = "id")
    private Course course;

    @Column(name = "others")
    private String otherFields;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getOtherFields() {
        return otherFields;
    }

    public void setOtherFields(String otherFields) {
        this.otherFields = otherFields;
    }
}
