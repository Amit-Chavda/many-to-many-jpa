package com.manytomany.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<StudentsCourses> studentsCourses;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StudentsCourses> getStudentsCourses() {
        return studentsCourses;
    }

    public void setStudentsCourses(Set<StudentsCourses> studentsCourses) {
        for (StudentsCourses studentsCourses1:studentsCourses) {
            studentsCourses1.setStudent(this);
        }
        this.studentsCourses = studentsCourses;
    }
}
