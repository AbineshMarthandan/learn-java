package org.example.ExampleClass;

class Animal {
    public void eat () {
        System.out.println("Animal will eat");
    }
}

class Horse extends Animal {
    public void eat () {
        System.out.println("Horse will eat");
    }
}

public class ExampleClass {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
    }
}
