package com.Barath.SortingAlgo;
// Time Complexity : O(n^2)
public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,3};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            int mini = i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
}
