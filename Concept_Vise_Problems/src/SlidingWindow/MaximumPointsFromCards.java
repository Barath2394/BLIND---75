package com.Barath.AdvancedDS.SlidingWindow;

public class MaximumPointsFromCards {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        System.out.println(findTheMaxPoints(arr,4));
    }
    static int findTheMaxPoints(int[] arr,int k) {
        int n = arr.length;
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;
//        Calculating the Left - Sum
        for (int i=0;i<k;i++) {
            lSum += arr[i];
        }
        maxSum = lSum;
//        Calculating the maxSum
        for (int i=0;i<n-k;i++) {
            lSum -= arr[i];
            rSum += arr[n-i-1];
            int totSum = lSum + rSum;
            maxSum = Math.max(maxSum,totSum);
        }
        return maxSum;
    }
}
