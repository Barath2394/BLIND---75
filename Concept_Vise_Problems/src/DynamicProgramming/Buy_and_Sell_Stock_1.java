package com.Barath.DynamicProgramming;

public class Buy_and_Sell_Stock_1 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findMaxProfit(prices));
    }
    static int findMaxProfit(int[] prices) {
        int maxProfit = 0;
        int current_Price = prices[0];
        for (int i=1;i<prices.length;i++) {
            current_Price = Math.min(current_Price,prices[i]);
            int current_Profit = prices[i] - current_Price;
            maxProfit = Math.max(current_Profit,maxProfit);
//            System.out.println(maxProfit);
        }
        return maxProfit;
    }
}
