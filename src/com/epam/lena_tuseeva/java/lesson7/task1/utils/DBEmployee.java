package com.epam.lena_tuseeva.java.lesson7.task1.utils;

import com.epam.lena_tuseeva.java.lesson7.task1.models.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBEmployee {
    private Connection connection = null;

    public DBEmployee(DBConnector connector) {
        this.connection = connector.getConnection();
    }

    public boolean createTable() {
        try {
            Statement statement = connection.createStatement();
            statement.execute(DBQueries.CREATE_TABLE_EMPLOYEE);
            statement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Employee> getAllEmployees() {
        try {
            List<Employee> employees = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DBQueries.GET_ALL_EMPLOYEES);
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Integer salary = Integer.parseInt(resultSet.getString("salary"));
                employees.add(new Employee(firstName, lastName, salary));
            }
            statement.close();
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean insertEmployee(Employee employee) {
        try {
            PreparedStatement statement = connection.prepareStatement(DBQueries.INSERT_EMPLOYEE);
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setInt(3, employee.getSalary());
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
