package org.example.array;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int studentCount = input.nextInt();
        input.nextLine();
        String[] studentList = new String[studentCount];
        for(int i=0; i<studentCount; i++) {
            System.out.println("Enter " + (i + 1) + " student name");
            studentList[i] = input.nextLine();
        }
        for (String name : studentList) {
            System.out.println(name);
        }
    }
}
