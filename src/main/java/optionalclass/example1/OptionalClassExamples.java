package optionalclass.example1;

import java.util.Optional;

public class OptionalClassExamples {
    public static void main(String[] args) {
        isPresentOptionalAPI();
        createEmptyOptionalObject();
        createEmptyOptionalObjectWithStaticAPI();
        ifPresentOptionalAPI();
        orElseOptionalAPI();
        orElseGetOptionalAPI();
        getOptionalAPI();
        orElseThrowOptionalAPI();
    }

    // Returns an Optional with the specified present non-null value.
    private static void isPresentOptionalAPI() {
        Optional<String> opt = Optional.of("Jonathan");
        System.out.println("isPresentOptionalAPI: " + opt.isPresent());
    }

    // Returns an Optional with the specified present non-null value.
    private static void createEmptyOptionalObject() {
        Optional<String> empty = Optional.empty();
        System.out.println("createEmptyOptionalObject: " + empty.isPresent());

        // Optional object with the static of API:
        String name = "Jonathan";
        Optional.of(name);
    }

    private static void createEmptyOptionalObjectWithStaticAPI() {
        String name = "Jonathan";
        Optional.of(name);
    }

    // If a value is present, invoke the specified consumer with the value, otherwise do
    // nothing.
    private static void ifPresentOptionalAPI() {
        System.out.println("ifPresentOptionalAPI");
        // The ifPresent API enables us to run some code on the wrapped value if it is
        // found to be non-null.
        // Before Optional, we would do something like this:
        String name = "Jonathan";
        if (name != null)
            System.out.println(name.length());

        //Optional<String> opt = Optional.of("Jonathan");
        Optional<String> opt = Optional.empty();
        opt.ifPresent(str -> System.out.println(str.length()));
    }

    // If a value is present, invoke the specified consumer with the value, otherwise do
    // nothing.
    private static void orElseOptionalAPI() {
        System.out.println("orElseOptionalAPI");
        // With orElse, the wrapped value is returned if it is present and the argument
        // given to
        // orElse is returned if the wrapped value is absent
        //String nullName = null;
        String nullName = "Angelica";

        // If a value is present, invoke the specified consumer with the value, otherwise
        // do nothing.
        //
        String name = Optional.ofNullable(nullName).orElse("Jonathan");
        System.out.println(name);
    }

    // Return the value if present, otherwise invoke other and return the result of that
    // invocation.
    private static void orElseGetOptionalAPI() {
        System.out.println("orElseGetOptionalAPI");
        String nullName = null;
        //String nullName = "Hija";
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Jonathan");
        System.out.println(name);
    }

    // Return the contained value, if present, otherwise throw an exception to be created
    // by the provided supplier.
    private static void orElseThrowOptionalAPI() {
        System.out.println("orElseThrowOptionalAPI");
        // This will throw exception
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }

    // If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException
    private static void getOptionalAPI() {
        System.out.println("getOptionalAPI");
        Optional<String> opt = Optional.of("Amber");
        String name = opt.get();
        System.out.println(name);
    }
}
