package it.spacecoding.programming;

import java.util.List;

import static java.util.Locale.filter;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 3, 5, 7, 15,4);
        // print all numbers in a list structured approach
        System.out.println("All numbers in the list");
        printAllNumbersInListFunctional(numbers);
        System.out.println("Only even numbers");
        printEvenNumbersInListNumbersFunctional(numbers);
        System.out.println("Only odd numbers");
        printOddNumbersInListNumbersFunctional(numbers);
        System.out.println("Print Squares of Even numbers ");
        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // [12,9,3,5,...]
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
    private static void printOddNumbersInListNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2!=0) // Lambda Expression
                .forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number->number %2 ==0) // Lambda expression
                //mappping - x -> x * x
                .map(number -> number * number)
                .forEach(System.out::println);
    }
    
}

