package optionalclass.summary;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        // Creating empty Optional object
        Optional<String> string = Optional.empty();
        Optional<Double> decimal = Optional.empty();
        //System.out.println("OptionalExample1: " + string.get() +" - " + decimal.get());

        // Creating Optional object
        Optional<String> string2 = Optional.of("Optinal class example");
        Optional<Double> decimal2 = Optional.of(45.51);
        System.out.println("OptionalExample1: " + string2.get() +" - " + decimal2.get());

        // Creating nullable Optional object
        Optional<String> string3 = Optional.ofNullable(null);
        Optional<Double> decimal3 = Optional.ofNullable(null);
        //System.out.println("OptionalExample1: " + string3.get() +" - " + decimal3.get());
    }
}
