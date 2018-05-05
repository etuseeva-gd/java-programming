package com.epam.lena_tuseeva.java.lesson7.task1.models;

public class Employee {
    private String firstName = null;
    private String lastName = null;
    private Integer salary = null;

    public Employee(String firstName, String lastName, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder strEmployee = new StringBuilder();
        strEmployee.append("[Object] Employee: ").append("\n")
                .append("First name: ").append(this.firstName).append("\n")
                .append("Last name: ").append(this.lastName).append("\n")
                .append("Salary: ").append(this.salary).append("\n");
        return String.valueOf(strEmployee);
    }
}
