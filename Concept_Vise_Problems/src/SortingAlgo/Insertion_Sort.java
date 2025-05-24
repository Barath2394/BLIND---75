package com.Barath.SortingAlgo;
// Time Complexity : O(n^2)
public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        insertionSort(arr,arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void insertionSort(int[] arr,int n) {
        for (int i=0;i<n;i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j --;
            }
        }
    }
}
