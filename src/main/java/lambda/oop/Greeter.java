package lambda.oop;

public class Greeter {

    public void greet( Greeting greeting){

        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        HelloUSGreeting helloUSGreeting = new HelloUSGreeting();
        greeter.greet(helloUSGreeting);
    }
}
