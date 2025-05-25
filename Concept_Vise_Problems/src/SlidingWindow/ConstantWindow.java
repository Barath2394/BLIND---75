package com.Barath.AdvancedDS.SlidingWindow;

public class ConstantWindow {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        System.out.println(findMaxSum(arr,4));
    }
    static int findMaxSum(int[] arr,int k) {
        int sum = 0;
        int l = 0;
        int r = k-1;
        for (int i=l;i<=r;i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        while (r < arr.length - 1) {
            sum -= arr[l];
            l ++;
            r ++;
            sum += arr[r];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
