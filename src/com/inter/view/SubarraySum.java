package com.inter.view;

public class SubarraySum {
    public static void findSubarrayWithSum(int[] arr, int target) {
        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            // Shrink window if sum is too big
            while (sum > target && start <= end) {
                sum -= arr[start++];
            }
            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 7, 5, 8, 6};
        int target = 13;
        findSubarrayWithSum(arr, target);
    }
}
