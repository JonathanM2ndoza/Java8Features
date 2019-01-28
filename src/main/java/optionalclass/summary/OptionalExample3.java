package optionalclass.summary;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.empty();
        optional1.ifPresent(System.out::println);

        Optional<String> optional2 = Optional.of("Java Optional example");
        optional2.ifPresent(System.out::println);
    }
}
