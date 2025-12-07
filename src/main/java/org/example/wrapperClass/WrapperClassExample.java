package org.example.wrapperClass;

public class WrapperClassExample {
    public static void main(String[] args) {
        Integer a = 20;
        Integer b = Integer.valueOf(10);
        System.out.println(a == b);
        System.out.println(Integer.compare(a, b));
    }
}
