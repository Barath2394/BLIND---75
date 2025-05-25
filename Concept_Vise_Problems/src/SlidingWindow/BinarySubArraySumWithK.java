package com.Barath.AdvancedDS.SlidingWindow;

public class BinarySubArraySumWithK {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int goal = 2;
        int ans1 = findTheCount(arr,goal);
        int ans2 = findTheCount(arr,goal-1);
        System.out.println(ans1 - ans2);
    }
    static int findTheCount(int[] arr,int goal) {
        int l = 0,r = 0,sum = 0;
        int count = 0;
        while (r < arr.length) {
            sum += arr[r];
            while (sum > goal) {
                sum -= arr[l++];
            }
            int len = r - l + 1;
            count += len;
            r++;
        }
        return count;
    }
}
