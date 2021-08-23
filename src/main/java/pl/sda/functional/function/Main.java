package pl.sda.functional.function;

import java.util.function.Function;

public class Main {

    public static void main(String... args) {
        Function<String, String> toUpperCase = word -> "Upper case: " + word.toUpperCase();

        System.out.println(toUpperCase.apply("plane"));
    }
}
