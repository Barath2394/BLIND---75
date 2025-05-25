package com.Barath.AdvancedDS.SlidingWindow;

public class LongestSubArraySumLessThanK {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
//        System.out.println(bruteForce(arr,14));
//        System.out.println(betterApproach(arr,14));
        System.out.println(optimal(arr,14));
    }
    static int bruteForce(int[] arr,int k) {
        int maxLen = 0;
        for (int i=0;i< arr.length;i++) {
            int sum = 0;
            for (int j=i;j< arr.length;j++) {
                sum += arr[j];
                if (sum <= k) {
                    maxLen = Math.max(maxLen,j-i+1);
                }
                else {
                    break;
                }
            }
        }
        return maxLen;
    }
    static int betterApproach(int[] arr,int k) {
        int l = 0,r = 0,sum = 0,maxLen = 0;
        while (r < arr.length-1) {
            sum += arr[r];
            while (sum > k) {
                sum -= arr[l];
                l ++;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen,r-l+1);
            }
            r ++;
        }
        return maxLen;
    }
    static int optimal(int[] arr,int k) {
        int l = 0,r = 0,sum = 0,maxLen = 0;
        while (r < arr.length-1) {
            sum += arr[r];
            if (sum > k) {
                sum -= arr[l];
                l ++;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen,r-l+1);
            }
            r ++;
        }
        return maxLen;
    }
}
