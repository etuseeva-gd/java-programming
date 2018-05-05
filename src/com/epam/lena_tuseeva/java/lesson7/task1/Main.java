package com.epam.lena_tuseeva.java.lesson7.task1;

import com.epam.lena_tuseeva.java.lesson7.task1.models.Employee;
import com.epam.lena_tuseeva.java.lesson7.task1.utils.DBConnector;
import com.epam.lena_tuseeva.java.lesson7.task1.utils.DBEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // JDBC driver name and database URL
    private final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

    //  Database credentials
    private final String USER = "postgres";
    private final String PASS = "postgres";

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        DBConnector dbConnector = new DBConnector();
        if (!dbConnector.process(DB_URL, USER, PASS)) {
            System.out.println("Сonnection failed!");
            return;
        }
        System.out.println("Сonnection was successful!");

        DBEmployee dbEmployee = new DBEmployee(dbConnector);
        if (!dbEmployee.createTable()) {
            System.out.println("Creation of the table failed!");
            return;
        }
        System.out.println("Table was created!");

        Employee mockEmployee = new Employee("lena", "tuseeva", 10000);
        if (!dbEmployee.insertEmployee(mockEmployee)) {
            System.out.println("Addition failed!");
            return;
        }
        System.out.println("Employee was added!");

        List<Employee> employees = dbEmployee.getAllEmployees();
        if (employees == null) {
            System.out.println("Something go wrong!");
            return;
        }

        for (int i = 0; i < 10; i++) {
            for (Employee employee : employees) {
                dbEmployee.insertEmployee(employee);
            }
        }

        if (!dbConnector.close()) {
            System.out.println("Сonnection didn't close!");
            return;
        }
        System.out.println("Сonnection was close!");
    }
}
