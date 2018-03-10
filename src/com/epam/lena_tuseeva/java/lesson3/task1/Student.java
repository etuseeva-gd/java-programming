package com.epam.lena_tuseeva.java.lesson3.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//todo rewrite with private
public class Student {
    public String firstName = null;
    public String lastName = null;
    public String curriculum = null;

    public Date startDate = null;

    public List<Course> courses = new ArrayList<>();

    public Student(String firstName, String lastName, String curriculum, Date startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.curriculum = curriculum;
        this.startDate = startDate;
    }

    public void addCourse(String name, Integer duration) {
        this.courses.add(new Course(name, duration));
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

}
