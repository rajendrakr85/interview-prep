package com.pack;
import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 2, 0, 1, 2};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        // Dutch National Flag Algorithm
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high--);
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
    	System.out.println(i+" "+j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
