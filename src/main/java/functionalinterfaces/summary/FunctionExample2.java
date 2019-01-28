package functionalinterfaces.summary;

import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = t -> (t - 5);
        Function<Integer, Integer> function2 = t -> (t * 2);

        //Using andThen() method
        int a = function1.andThen(function2).apply(50);
        System.out.println("Function Using andThen() method: " + a);

        //Using compose function
        int c = function1.compose(function2).apply(50);
        System.out.println("Function Using compose function: " + c);
    }
}
