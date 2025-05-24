package com.Barath.SortingAlgo;
// Time Complexity : O(n^2)
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,3,2};
        bubbleSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void bubbleSort(int[] arr,int n) {
        for (int i=0;i<n;i++) {
            boolean isSort = true;
            for (int j=0;j<n-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    isSort = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (isSort) {
                break;
            }
        }
    }
}
