package com.epam.lena_tuseeva.java.lesson1.task2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        String[] lines = new String[]{"line 1 fsd fsd", "line 2 f sdf", "line 3 dsdas", "line 4 daaffs"};

        task1(lines);
        task2(lines);
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
        int[] lengthLines = new int[lines.length];
        for (int i = 0; i < lengthLines.length; i++) {
            lengthLines[i] = lines[i].length();
        }
        //Maybe i don't understand task
        int middle = lengthLines[lines.length / 2];

        System.out.println("Middle: " +  middle);
        System.out.println("Lines:");
        for (String line : lines) {
            if (line.length() > middle) {
                System.out.println(line);
            }
        }
    }

    private void task3(String[] lines) {
        int[] lengthLines = new int[lines.length];
        for (int i = 0; i < lengthLines.length; i++) {
            lengthLines[i] = lines[i].length();
        }
        //Maybe i don't understand task
        int middle = lengthLines[lines.length / 2];

        System.out.println("Middle: " +  middle);
        System.out.println("Lines:");
        for (String line : lines) {
            if (line.length() < middle) {
                System.out.println(line);
            }
        }
    }

    private void task4(String[] words) {
        int[] amountChars = new int[words.length];

        int k = 0;
        for (String word : words) {
            Set<Character> chars = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }
            amountChars[k++] = chars.size();
        }

        int minValue = amountChars[0];
        int minIndex = 0;
        for (int i = 0; i < amountChars.length; i++) {
            if (minValue > amountChars[i]) {
                minValue = amountChars[i];
                minIndex = i;
            }
        }

        System.out.printf("Min value: " + words[minIndex]);
    }

    private void task5(String[] words) {
        for (String word : words) {
            Set<Character> chars = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }

            if (chars.size() == word.length()) {
                System.out.printf(word);
                return;
            }
        }
    }

    private void task6(String[] words) {
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
                    k++;
                } else if (k == 1) {
                    System.out.println(word);
                    return;
                }
            }
        }
    }
}
