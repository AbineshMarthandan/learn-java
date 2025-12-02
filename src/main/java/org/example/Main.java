package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[] a = {1, 2, 3};
       int[] b = a;
        System.out.println(a);
        b[2] = 4;
        for (int d : a) {
            System.out.println(d);
        }
        System.out.println("****************");
        for (int d : b) {
            System.out.println(d);
        }
    }
}