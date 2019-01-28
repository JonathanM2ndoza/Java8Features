package functionalinterfaces.summary;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Jonathan", 37 );
        Person p = supplier.get();
        System.out.println("SupplierExample - Person Detail:\n" + p.getName() + ", " + p.getAge());

        Supplier<String> supplierStr = () -> "Hello world.";
        Supplier<Number> supplierNum = () -> 40;

        System.out.println(supplierStr.get());
        System.out.println(supplierNum.get());
    }
}
