package it.spacecoding.programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        // print all numbers in a list structured approach
        printAllNumbersInListFunctional(List.of(12, 9, 3, 5, 7, 15));

    }
    private static void print(int number){
        System.out.println(number);
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // [12,9,3,5,...]
        // 12
        // 9
        // 3
        // 5
        // ...
        // trasformiamo in uno stream
        // per ogni elemento chiamiamo la stampa
        // usiamo un riferimento ad un metodo
        numbers.stream().forEach(FP01Functional::print); // Method Reference
        // per ogni elemento deve essere chiamato il metodo print
    }
   
}
