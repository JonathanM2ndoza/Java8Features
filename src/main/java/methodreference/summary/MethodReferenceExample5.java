package methodreference.summary;

import java.util.function.BiConsumer;

/**
 * Reference to a constructor
 */
public class MethodReferenceExample5 {
    public static void main(String[] args) {
        System.out.println("------------Using lambda expression------------");
        BiConsumer<Integer, Integer> addtion1 = (a, b) -> new MathOperation2(a, b);
        addtion1.accept(10, 20);

        System.out.println("\n------------Using method reference------------");
        BiConsumer<Integer, Integer> addtion2 = MathOperation2::new;
        addtion2.accept(50, 20);
    }
}
