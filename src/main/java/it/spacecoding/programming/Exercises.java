package it.spacecoding.programming;

import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "AWS", "Spring Boot", "Azure", "Docker");
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8);
        System.out.println("All Courses");
        printCourse(courses);
        System.out.println("Only courses containg Spring");
        printSelectedCourses(courses);
        System.out.println("Print courses whose name has atleast 4 letters");
        printCourseAtLeast4(courses);
        System.out.println("Print the cubes of odd numbers");
        printCubesOfOddsNumbers(numbers);
        System.out.println("Print the number of characters in each course name");
        printCharNumInEachCourse(courses);
    }

    // print all courses
    public static void printCourse(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    // print courses containing the word Spring
    public static void printSelectedCourses(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

    }

    // print courses whose name has atleast 4 letters
    public static void printCourseAtLeast4(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    // print the cubes of odd numbers
    public static void printCubesOfOddsNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2d != 0)
                .map(number -> Math.pow(number, 3))
                .forEach(System.out::println);
    }

    // print the number of characters in each course name
    public static void printCharNumInEachCourse(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }
}
