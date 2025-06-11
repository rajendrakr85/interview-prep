package com.inter.view;

import java.util.*;

public class SubarraySumWithNegatives {
    public static void findSubarray(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == target) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            if (map.containsKey(sum - target)) {
                System.out.println("Subarray found from index " + (map.get(sum - target) + 1) + " to " + i);
                return;
            }

            map.put(sum, i);
        }

        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int target = -10;
        findSubarray(arr, target);
    }
}
