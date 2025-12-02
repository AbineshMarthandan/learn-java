package org.example.array;

public class TraditionalSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 9, 34, 2, 8, 1};
        int length = arr.length;
        boolean swapped = false;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
