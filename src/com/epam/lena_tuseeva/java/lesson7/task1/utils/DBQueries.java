package com.epam.lena_tuseeva.java.lesson7.task1.utils;

public class DBQueries {
    public static final String CREATE_TABLE_EMPLOYEE =
            "CREATE TABLE IF NOT EXISTS employees(" +
            "        id SERIAL PRIMARY KEY UNIQUE NOT NULL," +
            "        first_name varchar(50) NOT NULL," +
            "        last_name varchar(50) NOT NULL," +
            "        salary INTEGER NOT NULL" +
            ")";

    public static final String INSERT_EMPLOYEE =
            "INSERT INTO employees (first_name, last_name, salary) VALUES(?, ?, ?)";

    public static final String GET_ALL_EMPLOYEES =
            "SELECT * FROM employees";
}
