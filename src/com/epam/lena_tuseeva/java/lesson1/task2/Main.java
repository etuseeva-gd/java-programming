package com.epam.lena_tuseeva.java.lesson1.task2;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        String[] lines = new String[]{"line 1 fsd fsd", "line 2 f sdf", "line 3 dsdas", "line 4 daaffs"};
    }

    private void task1(String[] lines) {
        int minLineLength = lines[0].length(), maxLineLength = lines[0].length();
        for (String line : lines) {
            minLineLength = Math.min(minLineLength, line.length());
            maxLineLength = Math.max(maxLineLength, line.length());
        }

        // todo: rewrite
        for (String line : lines) {
            int length = line.length();
            if (length == minLineLength) {
                System.out.println("Min:");
                System.out.println(line);
                System.out.println("Min length: " + length);
            }
            if (length == maxLineLength) {
                System.out.println("Max:");
                System.out.println(line);
                System.out.println("Max length: " + length);
            }
        }
    }

    private void task2(String[] lines) {

    }
}
