package it.spacecoding.programming;

import java.util.List;

import static java.util.Locale.filter;

public class FP01Functional {
    public static void main(String[] args) {
        // print all numbers in a list structured approach
        System.out.println("All numbers in the list");
        printAllNumbersInListFunctional(List.of(12, 9, 3, 5, 7, 15));
        System.out.println("Only even numbers");
        printEvenNumbersInListNumbersFunctional(List.of(12, 9, 3, 5, 7, 15));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // [12,9,3,5,...]
        // 12
        // 9
        // ...
        // trasformiamo in uno stream
        // per ogni elemento chiamiamo la stampa
        // usiamo un riferimento ad un metodo
        numbers.stream().forEach(FP01Functional::print); // Method Reference
        // per ogni elemento deve essere chiamato il metodo print

    }

    private static void printEvenNumbersInListNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP01Functional::isEven)
                .forEach(System.out::println);
        //Filter - Only Allow Even Numbers

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

