package org.example.string;

import java.util.Arrays;

public class Basic {
    public static void main (String args[]) {
        String sentence = "Hello Abinesh, Welcome to Java class";
        // conver string to arra
        char[] charArr = sentence.toCharArray();
        System.out.println(Arrays.toString(charArr));
        // length
        System.out.println("length : " + sentence.length());
        //charAt
        System.out.println("charAt : " + sentence.charAt(2));
        //substring
        System.out.println("substring : " + sentence.substring(0, 10));
        //indexOf
        System.out.println("indexOf : " + sentence.indexOf("W"));
        System.out.println("indexOf : " + sentence.indexOf("Welcome"));
        //replace
        System.out.println("replace : " + sentence.replace("W", "w"));
        //startsWith
        System.out.println("is startsWith H: " + sentence.startsWith("H"));
        //endsWith
        System.out.println("is endsWith a: : " + sentence.endsWith("A"));
        //toLowerCase
        System.out.println("toLowerCase : " + sentence.toLowerCase());
        //toUpperCase
        System.out.println("toUpperCase : " + sentence.toUpperCase());
        //split
        System.out.println("split : " + Arrays.toString(sentence.split(" ")));
        // string concadination (join two string)
        String str1 = "Hello";
        String str2 = "Word";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));
        // string compare
        System.out.println(str1.equals(str2));
        System.out.println(str1 == "Hello"); // not recommended because it compares the reference
        System.out.println(str1.equalsIgnoreCase("hello"));
        System.out.println(str1.compareTo("hello"));
    }
}
