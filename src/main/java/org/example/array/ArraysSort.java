package org.example.array;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 9, 34, 2, 8, 1};
        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(arr));

        // fill usage
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

        // equals checking
        int[] b = new int[arr.length];
        Arrays.fill(b, 6);
        System.out.println(Arrays.equals(arr, b));
    }
}
