package com.Barath.Arrays;

import java.util.ArrayList;

public class FindAllTheDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i< arr.length;i++) {
            int ind = Math.abs(arr[i]) - 1;
            if (arr[ind] < 0) {
                ans.add(ind+1);
            }
            arr[ind] = arr[ind] * -1;
        }
        return ans;
    }
}
