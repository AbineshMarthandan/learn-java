package org.example.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxFromArrayList {
    //2. Find the maximum and minimum values in an ArrayList
    //Problem: Write a program that finds the largest and smallest number in an ArrayList<Integer>.
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the size of an array");
        int n = input.nextInt();
        System.out.println("Enter the elements in an array");
        for (int i = 0; i < n; i++) {
            al.add(input.nextInt());
        }
        System.out.println(al.toString());
        List<Integer> sortedArray =  al.stream().sorted().toList();
        System.out.println("Min" + sortedArray.get(0));
        System.out.println("Max" + sortedArray.get(al.size()-1));
    }
}
