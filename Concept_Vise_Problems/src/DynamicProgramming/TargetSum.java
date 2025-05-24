package com.Barath.DynamicProgramming;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTheCount(arr,target));
    }
    static int findTheCount(int[] arr,int target) {
        int tot = 0;
        for (int i : arr) {
            tot += i;
        }
        if ((target + tot) % 2 != 0 || Math.abs(target) > tot) {
            return 0;
        }
        int subSeq = (tot + target) / 2;
        int[] dp = new int[subSeq + 1];
        dp[0] = 1;
        for (int i : arr) {
            for (int s = subSeq; s >= i; s--) {
                dp[s] += dp[s - i];
            }
        }
        return dp[subSeq];
    }
}
