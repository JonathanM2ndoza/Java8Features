package collectorclass.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample1 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        //Java Collectors Example: Fetching data as a List
        List<Float> productPriceList =
                productsList.stream()
                        .map(x->x.price)         // fetching price
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);

        //Java Collectors Example: Converting Data as a Set
        Set<Float> productPriceList2 =
                productsList.stream()
                        .map(x->x.price)         // fetching price
                        .collect(Collectors.toSet());   // collecting as list
        System.out.println(productPriceList2);

        //Java Collectors Example: using sum method
        Double sumPrices =
                productsList.stream()
                        .collect(Collectors.summingDouble(x->x.price));  // collecting as list
        System.out.println("Sum of prices: "+sumPrices);
        Integer sumId =
                productsList.stream().collect(Collectors.summingInt(x->x.id));
        System.out.println("Sum of id's: "+sumId);

        //Java Collectors Example: Getting Product Average Price
        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average price is: "+average);

        //Java Collectors Example: Counting Elements
        Long noOfElements = productsList.stream()
                .collect(Collectors.counting());
        System.out.println("Total elements : "+noOfElements);

    }

}
