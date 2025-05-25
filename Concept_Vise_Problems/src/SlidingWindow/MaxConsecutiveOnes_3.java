package com.Barath.AdvancedDS.SlidingWindow;

public class MaxConsecutiveOnes_3 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(findTheMaxLen(arr,2));
    }
    static int findTheMaxLen(int[] arr,int k) {
        int l = 0,r = 0,maxLen = 0;
        int zeros = 0;
        while (r < arr.length) {
            if (arr[r] == 0) {
                zeros ++;
            }
            if (zeros > k) {
                if (arr[l++] == 0) {
                    zeros --;
                }
            }
            if (zeros <= k) {
                int len = r - l + 1;
                maxLen = Math.max(maxLen,len);
            }
            r ++;
        }
        return maxLen;
    }
}
