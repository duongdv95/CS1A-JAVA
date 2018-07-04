package com.danielduong;

public class HelloWorldApp {
    public static void main(String[] args) {
        hello();
        world spanish = new world();
        spanish.greetings();
    }
    public static void hello() {
        System.out.println("Hello world");
    }
}

class world {
    public void greetings() {
        System.out.println("Hola Mundo");
    }
}