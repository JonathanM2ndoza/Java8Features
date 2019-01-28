package lambda.summary;

public class ExampleSingleParameter {
    public static void main(String[] args) {
        // without lambda expression
        Printable printable = new Printable() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printable.print(" Print message to console - without lambda expression....");

        // with lambda expression
        Printable withLambda = (msg) -> System.out.println(msg);
        withLambda.print(" Print message to console - with lambda expression....");
    }
}
