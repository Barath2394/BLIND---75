package com.Barath.DynamicProgramming;

public class HouseRobber_1 {
    public static void main(String[] args) {
        int[] house = {2,7,3,1,4,2,1,8};
        System.out.println(findMax_2(house));
    }
//    Without space optimization
    static int findMax_1(int[] house) {
        int[] dp = new int[house.length];
        dp[0] = house[0];
        dp[1] = house[1];
//        Finding the max things
        for (int i=2;i<house.length;i++) {
            dp[i] = Math.max((dp[i-2] + house[i]),dp[i-1]);
        }
        return dp[house.length-1];
    }
//    With space optimization
    static int findMax_2(int[] house) {
        for (int i=2;i<house.length;i++) {
            house[i] = Math.max((house[i-2]+house[i]), house[i-1]);
        }
        return house[house.length-1];
    }
}
