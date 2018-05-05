package com.epam.lena_tuseeva.java.lesson8.task1.utils;

public class Helpers {
    private static final String prefixOfClasses = "com.epam.lena_tuseeva.java.lesson8.task1.models.";
    private static final String prefixOfPath = "src/com/epam/lena_tuseeva/java/lesson8/task1/";

    public static String getPathToFile(String fileName) {
        return Helpers.prefixOfPath + fileName;
    }

    public static String getPathToClass(String className) {
        return Helpers.prefixOfClasses + className;
    }
}
