package com.pack;

import java.util.*;

public class CommonElementsInAllRows {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 9, 11},
            {3, 6, 7, 9, 10},
            {1, 3, 6, 8, 9}
        };

        Map<Integer, Integer> map = new HashMap<>();
        int rows = arr.length;
        int cols = arr[0].length;

        
        // Process rest of the rows
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int val = arr[i][j];
                if (map.containsKey(val)) {
                    map.put(val, i + 1); // Update count
                }else {
                	 map.put(val, 1);
                }
            }
        }

        // Print elements present in all rows
        System.out.println(map);
        System.out.println("Common elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == rows) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
