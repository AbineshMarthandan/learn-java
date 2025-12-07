package org.example.string;

interface SayHello {
    public void sayHi();
}

interface Operation {
    int add(int a, int b);
}

public class LamdaExpressionBasic {
    public static void main(String args[]) {
        // traditional one
        SayHello sayHello = new SayHello() {
            @Override
            public void sayHi() {
                System.out.println("*********");
            }
        };

        // After lamda expression
        SayHello sayHello1 = () ->  System.out.println("*********");

        // lamda with parameter
        Operation operation = (int a, int b) -> {
            return a+b;
        };
        System.out.println(operation.add(4, 5));
    }
}
