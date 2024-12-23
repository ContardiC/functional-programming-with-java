package it.spacecoding.programming;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
public class OptionalExamples{
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Kiwi", "Orange");
        // Creiamo un predicate per filtrare la nostra lista
        Predicate<? super String> predicate = fruit -> fruit.startsWith("B");
        fruits.stream().filter(predicate).forEach(System.out::println);
        // Cerchiamo la prima occorrenza e siccome potrebbe non esserci usiamo Optional<>
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        // metodi utili di Optional
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        // Best practice da Java 8 per rappresentare i valori vuoti 
        Optional<String> names = Optional.empty(); 
        // Non usare : String names = null;
    }
}