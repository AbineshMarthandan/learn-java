package org.example.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        String[] words = {"Python", "Java", "C", "Java Script"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println("Enter words to search");
        Scanner input = new Scanner(System.in);
        String searchTerm = input.nextLine();
        int index = Arrays.binarySearch(words, searchTerm);
        System.out.println(Arrays.toString(words));
        System.out.println("index of search term is : " + index);
    }
}
