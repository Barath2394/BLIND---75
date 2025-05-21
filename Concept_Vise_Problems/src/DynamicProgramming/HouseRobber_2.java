package com.Barath.DynamicProgramming;

public class HouseRobber_2 {
    public static void main(String[] args) {
        int[] house = {2,7,3,1,4,2,1,8};
        System.out.println(findMax(house));
    }
    static int findMax(int[] house) {
        int[] dp1 = new int[house.length-1];
        int[] dp2 = new int[house.length-1];

        for (int i=0;i<house.length-1;i++) {
            dp1[i] = house[i];
            dp2[i] = house[i+1];
        }
        int skipFirst = robHouse(dp1);
        int skipLast = robHouse(dp2);

        return Math.max(skipFirst,skipLast);
    }
    static int robHouse(int[] house) {
        for (int i=2;i<house.length;i++) {
            house[i] = Math.max((house[i-2] + house[i]),house[i]);
        }
        return house[house.length-1];
    }
}
