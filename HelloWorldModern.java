package com.company;

public class HelloWorldModern {

    public static void main(String[] args) {
        HelloWorld helloWorld =() -> { return "Hello World!";};
        IncrementByFive incrementByFive=(a)-> { return a+5;};

        System.out.println(helloWorld.sayHello());
        System.out.println(incrementByFive.incrementByFive(5));
    }
}
