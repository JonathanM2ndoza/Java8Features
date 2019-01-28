package lambda.summary;

public class ExampleNoParameter {
    public static void main(String[] args) {
        // without lambda expression
        Sayable sayable = new Sayable() {
            @Override
            public String say() {
                return "Hello World without lambda expression ..";
            }
        };
        System.out.println(sayable.say());

        // with lambda expression
        Sayable withLambda = () -> "Hello World with lambda expression ..";
        System.out.println(withLambda.say());
    }
}
