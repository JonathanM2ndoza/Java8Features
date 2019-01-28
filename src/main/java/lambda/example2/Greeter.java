package lambda.example2;

public class Greeter {

    public void greet( Greeting greeting){

        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        Greeting greeting = ()-> System.out.println("Hello Wolrd");
        greeter.greet(greeting);
        greeting = ()-> System.out.println("Hello Wolrd US");
        greeter.greet(greeting);


        MyLambda myLambda = ()-> System.out.println("myLambda");
        myLambda.foo();

        MyAdd myAdd = (a,b)->a+b;
        System.out.println("myAdd"+ myAdd.add(5,2));
    }
}
