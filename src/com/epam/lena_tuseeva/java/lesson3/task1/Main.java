package com.epam.lena_tuseeva.java.lesson3.task1;

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
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.YYYY");

            Student ivan = new Student("Ivan", "Ivanov", "J2EE Developer", format.parse("10.03.2018"));
            ivan.addCourse("Технология Java Servlets", 16);
            ivan.addCourse("Struts Framework", 24);

            Student petr = new Student("Petr", "Petrov", "Java Developer", format.parse("11.03.2018"));
            petr.addCourse("Обзор технологий Java", 8);
            petr.addCourse("Библиотека JFC/Swing", 16);
            petr.addCourse("Технология JDBC", 16);

            EducationalCenter center = new EducationalCenter();
            center.addStudent(ivan);
            center.addStudent(petr);
            // End init zone

            Scanner sc = new Scanner(System.in);
            System.out.println("Select report type:");
            System.out.println("1 - simple report");
            System.out.println("2 - full report");

            int action = sc.nextInt();
            switch (action) {
                case 1: {
                    break;
                }
                case 2: {
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
