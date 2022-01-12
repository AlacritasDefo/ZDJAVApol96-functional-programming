package pl.sda.functional.consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String... args) {
        Consumer<String> upperCaseConsumer = word -> {
            String upperCaseWord = word.toUpperCase();
            System.out.println(upperCaseWord);
        };

        upperCaseConsumer.accept("Tony Stark");
    }
}