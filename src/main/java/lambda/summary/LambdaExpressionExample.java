package lambda.summary;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable withoutLambda = new Drawable() {
            public void draw() {
                System.out.println("Drawing without lambda: " + width);
            }
        };
        withoutLambda.draw();

        //with lambda
        Drawable withLambda = () -> System.out.println("Drawing with lambda: " + width);
        withLambda.draw();
    }
}
