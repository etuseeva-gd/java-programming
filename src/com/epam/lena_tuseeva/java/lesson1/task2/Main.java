package com.epam.lena_tuseeva.java.lesson1.task2;

import java.util.*;

public class Main {
    private Scanner sc = null;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        sc = new Scanner(System.in);

        System.out.println("Enter number of task:");
        int action = sc.nextInt();

        switch (action) {
            case 1: {
                this.printMinMaxLines(this.readLines());
                break;
            }
            case 2: {
                this.printLinesLongerThanAverage(this.readLines());
                break;
            }
            case 3: {
                this.printLinesLessThanAverage(this.readLines());
                break;
            }
            case 4: {
                this.printWordsWithMinDifferenceChars(this.readWords());
                break;
            }
            case 5: {
                this.printFirstWordWithAllDifferenceChars(this.readWords());
                break;
            }
            case 6: {
                this.printSecondWordWithAllNumbers(this.readWords());
                break;
            }
            default: {
                System.out.println("Incorrect number!");
            }
        }

        if (sc != null) {
            sc.close();
        }
    }

    private String[] readLines() {
        System.out.println("Enter lines:");
        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Enter lines:");
        sc.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        return strings;
    }

    private String[] readWords() {
        System.out.println("Enter words:");
        sc.nextLine();
        return sc.nextLine().split(" ");
    }

    private int getAverage(String[] lines) {
        int[] lengthLines = new int[lines.length];
        for (int i = 0; i < lengthLines.length; i++) {
            lengthLines[i] = lines[i].length();
        }
        Arrays.sort(lengthLines);
        return lengthLines[lines.length / 2];
    }

    private void printMinMaxLines(String[] lines) {
        int minLineLength = lines[0].length(), maxLineLength = lines[0].length();
        for (String line : lines) {
            minLineLength = Math.min(minLineLength, line.length());
            maxLineLength = Math.max(maxLineLength, line.length());
        }

        System.out.println("Task1:");
        for (String line : lines) {
            int length = line.length();
            if (length == minLineLength) {
                System.out.println("Min line = " + line + ", length = " + length);
            }
            if (length == maxLineLength) {
                System.out.println("Max line = " + line + ", length = " + length);
            }
        }
    }

    private void printLinesLongerThanAverage(String[] lines) {
        int averageLength = this.getAverage(lines);

        System.out.println("Task2: ");
        System.out.println("Average length = " + averageLength);
        System.out.println("Lines that longer than average:");
        for (String line : lines) {
            if (line.length() > averageLength) {
                System.out.println(line);
            }
        }
    }

    private void printLinesLessThanAverage(String[] lines) {
        int averageLength = this.getAverage(lines);

        System.out.println("Task3: ");
        System.out.println("Average length = " + averageLength);
        System.out.println("Lines that less than average:");
        for (String line : lines) {
            if (line.length() < averageLength) {
                System.out.println(line);
            }
        }
    }

    private void printWordsWithMinDifferenceChars(String[] words) {
        int[] amountChars = new int[words.length];

        int k = 0;
        for (String word : words) {
            Set<Character> chars = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }
            amountChars[k++] = chars.size();
        }

        int minValue = amountChars[0], minIndex = 0;
        for (int i = 0; i < amountChars.length; i++) {
            if (minValue > amountChars[i]) {
                minValue = amountChars[i];
                minIndex = i;
            }
        }

        System.out.println("Task4:");
        System.out.printf("Word with min difference chars = " + words[minIndex]);
    }

    private void printFirstWordWithAllDifferenceChars(String[] words) {
        System.out.println("Task5:");

        for (String word : words) {
            Set<Character> chars = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }

            if (chars.size() == word.length()) {
                System.out.printf("First word with all difference chars = " + word);
                return;
            }
        }

        System.out.println("No such words!");
    }

    private void printSecondWordWithAllNumbers(String[] words) {
        System.out.println("Task6:");

        String firstWord = null;
        int k = 0;
        for (String word : words) {
            Set<Character> chars = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }

            boolean onlyNumbers = true;
            for (Character c : chars) {
                if (c < '0' || c > '9') {
                    onlyNumbers = false;
                }
            }

            if (onlyNumbers) {
                if (k == 0) {
                    firstWord = word;
                    k++;
                } else if (k == 1) {
                    System.out.printf("Second word with all number-chars = " + word);
                    return;
                }
            }
        }

        if (firstWord != null) {
            System.out.printf("Fist word with all number-chars = " + firstWord);
            return;
        }

        System.out.println("No such words!");
    }
}
