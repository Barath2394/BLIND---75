package com.Barath.DynamicProgramming;

public class MaxLenOfTheRepeatedSubArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,4,5};
        System.out.println(findMax(arr1,arr2));
    }
    static int findMax(int[] arr1,int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
//        Creating dp array
        int[][] dp = new int[m+1][n+1];
        int maxLen = Integer.MIN_VALUE;
        for (int i=1;i<=m;i++) {
            for (int j=1;j<=m;j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                maxLen = Math.max(maxLen,dp[i][j]);
            }
        }
        return maxLen;
    }
}
