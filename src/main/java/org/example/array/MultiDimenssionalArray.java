package org.example.array;

import java.util.Arrays;

public class MultiDimenssionalArray {
    public static void main(String args[]) {
        int [][] my2DArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(my2DArray));
    }
}
