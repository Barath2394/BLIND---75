package com.Barath.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0,0,1,2,2};
//        better(arr);
        optimal(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    static void better(int[] arr){
        int cnt0 = 0,cnt1 = 0,cnt2 = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] == 0) cnt0 ++;
            else if(arr[i] == 1) cnt1 ++;
            else cnt2 ++;
        }
        for (int i=0;i<cnt0;i++){
            arr[i] = 0;
        }
        for (int i=cnt0;i<cnt0+cnt1;i++){
            arr[i] = 1;
        }
        for (int i=cnt0+cnt1;i< arr.length;i++){
            arr[i] = 2;
        }
    }
    static void optimal(int[] arr){
        int low = 0,mid = 0,high = arr.length-1;
        while (mid <= high){
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low ++;
                mid ++;
            }
            else if (arr[mid] == 1) {
                mid ++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high --;
            }
        }
    }
}
