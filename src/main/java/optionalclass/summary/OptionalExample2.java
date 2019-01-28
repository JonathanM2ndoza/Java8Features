package optionalclass.summary;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> string = Optional.empty();
        if(string.isPresent()){
            System.out.println(string.get());
        }

        Optional<String> string2 = Optional.of("Optinal class example");
        if(string2.isPresent()){
            System.out.println(string2.get());
        }

        Optional<String> string3 = Optional.ofNullable(null);
        if(string3.isPresent()){
            System.out.println(string3.get());
        }
    }
}
