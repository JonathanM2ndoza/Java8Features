package lambda.oop;

public class HelloUSGreeting implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello US Greeting");
    }
}
