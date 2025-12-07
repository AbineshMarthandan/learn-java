package org.example.lamdaExpressionExample;

public class FunctionInterfaceExample {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static void main(String args[]) {
        int addResult = add(5, 5);
        int subResult = sub(5, 4);
        System.out.println(addResult);
        System.out.println(subResult);

        // we can replace with function interface
    }
}
