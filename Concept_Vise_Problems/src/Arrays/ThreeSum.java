package com.Barath.Arrays;
import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,4};
        System.out.println(findThreeSum(arr));
    }
    static List<List<Integer>> findThreeSum(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> all = new HashSet<>();
        for (int i=0;i<arr.length-2;i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    all.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left ++;
                    right --;
                }
                else if (sum < 0) {
                    left ++;
                }
                else {
                    right --;
                }
            }
        }
        return new ArrayList<>(all);
    }
}
