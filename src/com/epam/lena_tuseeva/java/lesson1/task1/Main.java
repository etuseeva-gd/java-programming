package com.epam.lena_tuseeva.java.lesson1.task1;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int[] array = this.genArray(-10, 10, 20);
        this.printArray("Initial array:", array);

        int[] task1 = this.task1(array);
        if (task1 == null) {
            System.out.println("Task 1:");
            System.out.println("No positive or negative elements");
        } else {
            this.printArray("Task 1:", task1);
        }

        System.out.println("Task 2:");
        System.out.println(this.task2(array));

        this.printArray("Task 3:", this.task3(array));
        this.printArray("Task 4:", this.task4(array));

        System.out.println("Task 5:");
        System.out.println(this.task5(array));

        this.printArray("Task 6:", this.task6(array));
    }

    int[] genArray(int minValue, int maxValue, int length) {
        int[] array = new int[length];

        int range = (maxValue - minValue) + 1;
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * range) + minValue;
        }

        return array;
    }

    void printArray(String label, int[] array) {
        System.out.println(label);
        for (int arrElem : array) {
            System.out.print(arrElem + " ");
        }
        System.out.println();
    }

    int[] task1(int[] array) {
        int[] arrayClone = array.clone();

        int minPositiveElement = Integer.MAX_VALUE, minPositiveIndex = -1;
        int maxNegativeElement = Integer.MIN_VALUE, maxNegativeIndex = -1;

        for (int i = 0; i < arrayClone.length; i++) {
            int elem = arrayClone[i];

            if (elem < 0 && elem > maxNegativeElement) {
                maxNegativeElement = elem;
                maxNegativeIndex = i;
            }

            if (elem > 0 && elem < minPositiveElement) {
                minPositiveElement = elem;
                minPositiveIndex = i;
            }
        }

        if (minPositiveIndex != -1 && maxNegativeIndex != -1) {
            arrayClone[minPositiveIndex] = maxNegativeElement;
            arrayClone[maxNegativeIndex] = minPositiveElement;
            return arrayClone;
        }

        return null;
    }

    int task2(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    int[] task3(int[] array) {
        int[] arrayClone = array.clone();

        for (int i = 0; i < arrayClone.length; i++) {
            if (arrayClone[i] < 0) {
                arrayClone[i] = 0;
            }
        }

        return arrayClone;
    }

    int[] task4(int[] array) {
        int[] arrayClone = array.clone();

        for (int i = 0; i < arrayClone.length - 1; i++) {
            if (arrayClone[i] > 0 && arrayClone[i + 1] < 0) {
                arrayClone[i] *= 3;
            }
        }

        return arrayClone;
    }

    double task5(int[] array) {
        int minElement = array[0];
        int sumElements = 0;

        for (int arrElem : array) {
            minElement = Math.min(minElement, arrElem);
            sumElements += arrElem;
        }

        return (sumElements / array.length) - minElement;
    }

    int[] task6(int[] array) {
        int[] used = new int[21];

        for (int i = 1; i < array.length; i += 2) {
            used[array[i] + 10]++;
        }

        int length = 0;
        for (int usedElem : used) {
            if (usedElem > 1) {
                length += usedElem;
            }
        }

        if (length == 0) {
            return null;
        }

        int[] result = new int[length];
        int j = 0;
        for (int i = 1; i < array.length; i += 2) {
            if (used[array[i] + 10] > 1) {
                result[j++] = array[i];
            }
        }

        return result;
    }
}
