package com.Barath.DynamicProgramming;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        System.out.println(lcs("abcdaf","acbcf"));
    }
    static int lcs(String str1,String str2) {
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
}
