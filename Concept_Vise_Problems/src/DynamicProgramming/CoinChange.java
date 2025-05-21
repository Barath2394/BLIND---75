package com.Barath.DynamicProgramming;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(findMin(coins,amount));
    }
    static int findMin(int[] coins,int amount) {
        int[] dp = new int[amount+1];
        for (int i = 1 ; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && dp[i-coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i] , 1 + dp[i-coin]);
                }
            }
        }
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
    }
}
