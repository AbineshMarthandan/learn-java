package org.example.string;

public class StringFormating {
    public static void main(String[] args) {
        String formattedString = String.format("Hello %s!", "java"); // %s will be replaced with java
        System.out.println(formattedString);
        String str1 = "JAVA";
        String str2 = "JAVA";
//        str1 = "ABI";
        String str3 = new String("JAVA");
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
    }
}
