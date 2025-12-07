package org.example.string;

public class toStringExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");
        String result = stringBuffer.toString();
        System.out.println(result);

        // reverse
        System.out.println(stringBuffer.reverse());

    }
}
