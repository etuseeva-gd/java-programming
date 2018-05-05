package com.epam.lena_tuseeva.java.lesson6.task1.utils;

import java.io.*;

public class Helpers {
    public static final String prefixOfFiles = "src/com/epam/lena_tuseeva/java/lesson6/task1/";

    public static void printObject(File file, Object object) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        }
    }

    public static Object readObject(File file) throws IOException, ClassNotFoundException {
        Object readObject = null;
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))) {
            readObject = oin.readObject();
        }
        return readObject;
    }
}
