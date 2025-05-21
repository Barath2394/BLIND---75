package com.Barath.Arrays;

import java.util.Arrays;

public class TwoSumBetter {
    public static void main(String[] args) {
        int[] arr = {2,7,1,4};
        for (int i : findTheBetter(arr,9)) {
            System.out.print(i + " ");
        }
    }
    static int[] findTheBetter(int[] arr,int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                return new int[]{arr[left], arr[right]};
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {-1 , -1};
    }
}
