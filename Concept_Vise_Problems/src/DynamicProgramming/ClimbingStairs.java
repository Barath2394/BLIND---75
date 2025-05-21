package com.Barath.DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(findNoWays(5));
    }
    static int findNoWays(int n) {
        int[] dp = new int[n+1];
//        Declaring the ini values
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
