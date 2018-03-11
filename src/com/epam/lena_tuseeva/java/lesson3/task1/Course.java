package com.epam.lena_tuseeva.java.lesson3.task1;

public class Course {
    public String name = null;
    public Integer duration = null;

    public  Course(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(name).append(" ").append("Длительность: ").append(duration));
    }
}
