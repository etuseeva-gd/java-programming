package com.epam.lena_tuseeva.java.lesson1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter number of operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Difference (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int action = sc.nextInt();
        switch (action) {
            case 1: {
                System.out.println(this.add(a, b));
                break;
            }
            case 2: {
                System.out.println(this.diff(a, b));
                break;
            }
            case 3: {
                System.out.println(this.mult(a, b));
                break;
            }
            case 4: {
                System.out.println(this.div(a, b));
                break;
            }
            default: {
                System.out.println("Incorrect operation!");
            }
        }
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int diff(int a, int b) {
        return a - b;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private double div(double a, double b) {
        return a / b;
    }
}
