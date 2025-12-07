package org.example.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String args[]) {
//        Remove duplicate elements from an ArrayList
//        Problem: Given an ArrayList<Integer>, remove duplicate values without using a Set.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        System.out.println("Enter the elements in an array");
        List<Integer> arrList = new ArrayList<>();
        for (int i =0; i<n; i++) {
            int inputValue = input.nextInt();
            arrList.add(inputValue);
        }
        System.out.println("****Inputted Elements are******");
        System.out.println(arrList.toString());
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index<n; index++) {
            if( arrList.indexOf(arrList.get(index)) == index){
                result.add(arrList.get(index));
            }
        }
        System.out.println(result.toString());

    }
}
