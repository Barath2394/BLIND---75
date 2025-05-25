package com.Barath.AdvancedDS.SlidingWindow;

public class MinimumWindow {
    public static void main(String[] args) {
        int[] arr = {4,8,15,16,23};
        System.out.println(findMinWindow(arr,7));
    }
    static int findMinWindow(int[] arr,int k) {
        int left = 0,right = 0;
        int sum = 0,minLen = Integer.MAX_VALUE;
        while (right < arr.length) {
            sum += arr[right];
            if (sum >= k) {
                minLen = Math.min(minLen,right-left+1);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
