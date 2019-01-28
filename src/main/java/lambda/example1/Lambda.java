package lambda.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda {

    public static void orderList(){
        List<String> items = new ArrayList<String>();
        items.add("Perro");
        items.add("Gato");
        items.add("Lobo");
        items.add("Oso");

        System.out.println("================== Before sort");
        items.forEach(item -> System.out.println(item));

        Collections.sort(items,(p1, p2)->p1.compareTo(p2));

        System.out.println("================== After sort");
        items.forEach(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        orderList();

        System.out.println("================== Calculator");
        Calculator suma = (x,y) -> x+y;
        System.out.println("suma: " + suma.operation(4,5));

        Calculator mult = (x,y) -> x*y;
        System.out.println("mult: " + mult.operation(4,5));

        int a = 20;
        Calculator op = (x,y) -> {
            System.out.println("Other Lambda");
            return x+y+a;
        };
        System.out.println("op: " + op.operation(4,5));
    }
}
