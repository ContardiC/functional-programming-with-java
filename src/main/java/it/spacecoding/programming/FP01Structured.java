package it.spacecoding.programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        // print all numbers in a list structured approach
        printAllNumbersInListStructured(List.of(12, 9, 3, 5, 7, 15));

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
