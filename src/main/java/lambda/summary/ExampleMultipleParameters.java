package lambda.summary;

public class ExampleMultipleParameters {
    public static void main(String[] args) {

        // without lambda expression
        Addable addable = new Addable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Without lambda expression");
        System.out.println( addable.add(10, 20));

        // with lambda expression
        // Multiple parameters in lambda expression
        System.out.println("With lambda expression, multiple parameters in lambda expression");
        Addable withLambda = (a, b) -> (a + b);
        System.out.println(withLambda.add(10, 20));

        // Multiple parameters with data type in lambda expression
        System.out.println("Multiple parameters with data type in lambda expression");
        Addable withLambdaD = (int a, int b) -> (a + b);
        System.out.println(withLambdaD.add(100, 200));
    }
}
