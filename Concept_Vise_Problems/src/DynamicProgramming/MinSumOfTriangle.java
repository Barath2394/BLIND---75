package com.Barath.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSumOfTriangle {
    public static void main(String[] args) {
        // Example triangle
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        // Find minimum sum path
        int minSum = findMin(triangle);
        System.out.println("Minimum sum path in the triangle is: " + minSum);
    }

    static int findMin(List<List<Integer>> arr) {
        int height = arr.size();
        int[] dp = new int[height];

        // Copy the bottom row into the dp array
        for (int i = 0; i < height; i++) {
            dp[i] = arr.get(height - 1).get(i);
        }

        // Start from the second-last row and go upwards
        for (int level = height - 2; level >= 0; level--) {
            for (int i = 0; i < arr.get(level).size(); i++) {
                dp[i] = arr.get(level).get(i) + Math.min(dp[i], dp[i + 1]);
            }
        }

        // The minimum path sum will be at dp[0]
        return dp[0];
    }
}

