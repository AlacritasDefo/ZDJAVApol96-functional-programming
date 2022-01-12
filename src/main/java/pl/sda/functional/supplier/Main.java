package pl.sda.functional.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String... args) {
        Supplier<String> defaultString = () -> "I am Iron Man!";
        System.out.println(defaultString.get());
    }
}