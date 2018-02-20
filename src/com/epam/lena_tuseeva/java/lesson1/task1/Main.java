package com.epam.lena_tuseeva.java.lesson1.task1;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int[] array = this.genArray(-10, 10, 20);
        this.printArray("Initial array:", array);

        //task1
        int[] firstTask = this.swapMinPositiveMaxNegativeElements(array);
        String firstTaskLabel = "Task 1 (Swap min positive and max negative elements):";
        if (firstTask == null) {
            System.out.println(firstTaskLabel);
            System.out.println("No positive or negative elements!");
            System.out.println();
        } else {
            this.printArray(firstTaskLabel, firstTask);
        }

        //task2
        System.out.println("Task 2 (Sum of elements in even positions):");
        System.out.println(this.getSumOfElementsInEventPositions(array));

        //task3
        this.printArray("Task 3 (Replace negative elements with zeros):", this.replaceNegativeElementsWithZero(array));

        //task4
        this.printArray("Task 4 (Triple positive element, if it stand before negative element):", this.triplePositiveElementsIfAfterNegativeElement(array));

        //task5
        System.out.println("Task 5 (Difference between average and min element):");
        System.out.println(this.getDiffBetweenAverageAndMinElement(array));

        //task6
        int[] sixTask = this.getDuplicateElementsThatStandOnOddPositions(array);
        String sixTaskLabel = "Task 6 (Print duplicate elements, it's stand on odd positions):";
        if (sixTask == null) {
            System.out.println(sixTaskLabel);
            System.out.println("No duplicate elements!");
            System.out.println();
        } else {
            this.printArray(sixTaskLabel, sixTask);
        }
    }

    private int[] genArray(int minValue, int maxValue, int length) {
        int[] array = new int[length];

        int range = (maxValue - minValue) + 1;
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * range) + minValue;
        }

        return array;
    }

    private void printArray(String label, int[] array) {
        System.out.println(label);
        for (int arrElem : array) {
            System.out.print(arrElem + " ");
        }
        System.out.println();
    }

    //task1
    private int[] swapMinPositiveMaxNegativeElements(int[] array) {
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

    //task2
    private int getSumOfElementsInEventPositions(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    //task3
    private int[] replaceNegativeElementsWithZero(int[] array) {
        int[] arrayClone = array.clone();

        for (int i = 0; i < arrayClone.length; i++) {
            if (arrayClone[i] < 0) {
                arrayClone[i] = 0;
            }
        }

        return arrayClone;
    }

    //task4
    private int[] triplePositiveElementsIfAfterNegativeElement(int[] array) {
        int[] arrayClone = array.clone();

        for (int i = 0; i < arrayClone.length - 1; i++) {
            if (arrayClone[i] > 0 && arrayClone[i + 1] < 0) {
                arrayClone[i] *= 3;
            }
        }

        return arrayClone;
    }

    //task5
    private double getDiffBetweenAverageAndMinElement(int[] array) {
        int minElement = array[0];
        int sumElements = 0;

        for (int arrElem : array) {
            minElement = Math.min(minElement, arrElem);
            sumElements += arrElem;
        }

        return (sumElements / array.length) - minElement;
    }

    //task6
    private int[] getDuplicateElementsThatStandOnOddPositions(int[] array) {
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
