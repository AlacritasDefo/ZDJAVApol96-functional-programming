package pl.sda.functional.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> notEmpty = Optional.of("test");
        Optional<String> empty = Optional.empty();

        if (notEmpty.isPresent()) {
            System.out.println(notEmpty.get());
        }

        empty.ifPresentOrElse(System.out::println, () -> System.out.println("pusty"));
    }
}
