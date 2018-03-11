package com.epam.lena_tuseeva.java.lesson3.task1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
        Date currentDate = new Date();
        for (Student student : this.students) {
            System.out.println(student.toString());

            int programDuration = student.courses.stream()
                    .map(course -> course.duration)
                    .reduce(0, (a, b) -> a + b);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(student.startDate);

            int startDay = calendar.get(Calendar.DAY_OF_MONTH);

            System.out.println(student.startDate);

        }
    }

    public void printFullReport() {
        Date currentDate = new Date();
    }
}
