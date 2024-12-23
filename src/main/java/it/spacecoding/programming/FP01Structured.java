package it.spacecoding.programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        // print all numbers in a list structured approach
        System.out.println("All numbers in the list");
        printAllNumbersInListStructured(List.of(12, 9, 3, 5, 7, 15));
        System.out.println("Only even numbers");
        printEvenNumbersInListNumbersStructured(List.of(12, 9, 3, 5, 7, 15));
    }
    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    private static void printEvenNumbersInListNumbersStructured(List<Integer> numbers){
        for(int number : numbers){
            if(number%2==0){
                System.out.println(number);
            }
        }
    }
    
}
