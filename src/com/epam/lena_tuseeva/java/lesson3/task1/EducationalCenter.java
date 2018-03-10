package com.epam.lena_tuseeva.java.lesson3.task1;

import java.util.ArrayList;
import java.util.List;

public class EducationalCenter {
    private List<Student> students = null;

    public EducationalCenter() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printReport() {

    }

    public void printFullReport() {

    }
}
