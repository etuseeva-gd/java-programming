package com.epam.lena_tuseeva.java.lesson3.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try {
            // Init zone
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

            // Students
            Student firstStudent = new Student("Ivan", "Ivanov", "J2EE Developer", simpleDateFormat.parse("27.03.2018"));
            Student secondStudent = new Student("Petr", "Petrov", "Java Developer", simpleDateFormat.parse("02.04.2018"));

            // Courses
            Course javaServletsCourse = new Course("Технология Java Servlets", 16);
            Course strutsFrameworkCourse = new Course("Struts Framework", 24);
            Course javaTechnologiesCourse = new Course("Обзор технологий Java", 8);
            Course JFCLibraryCourse = new Course("Библиотека JFC/Swing", 16);
            Course JDBCTechnologyCouse = new Course("Технология JDBC", 16);

            // Add student on courses
            firstStudent.addCourse(javaServletsCourse);
            firstStudent.addCourse(strutsFrameworkCourse);

            secondStudent.addCourse(javaTechnologiesCourse);
            secondStudent.addCourse(JFCLibraryCourse);
            secondStudent.addCourse(JDBCTechnologyCouse);

            // Center
            EducationalCenter center = new EducationalCenter();
            center.addStudent(firstStudent);
            center.addStudent(secondStudent);

            // End init zone

            Scanner sc = new Scanner(System.in);
            System.out.println("Select report type:");
            System.out.println("1 - simple report");
            System.out.println("2 - full report");

//            int action = sc.nextInt();
            int action = 1;
            switch (action) {
                case 1: {
                    center.printReport();
                    break;
                }
                case 2: {
                    center.printFullReport();
                    break;
                }
                default: {
                    System.out.println("Incorrect operation!");
                }
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
