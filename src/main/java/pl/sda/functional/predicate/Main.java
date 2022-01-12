package pl.sda.functional.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String... args) {
        Predicate<String> containsTestWordPredicate = word -> word.toLowerCase().contains("test");

        System.out.println(containsTestWordPredicate.test("Witam"));

        System.out.println(containsTestWordPredicate.test("Testowe slowo"));
    }
}