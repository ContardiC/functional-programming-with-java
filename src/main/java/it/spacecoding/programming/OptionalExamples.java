package it.spacecoding.programming;
import java.util.List;
import java.util.function.Predicate;
public class OptionalExamples{
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Kiwi", "Orange");
        // Creiamo un predicate per filtrare la nostra lista
        Predicate<? super String> predicate = fruit -> fruit.startsWith("B");
        fruits.stream().filter(predicate).forEach(System.out::println);
    }
}