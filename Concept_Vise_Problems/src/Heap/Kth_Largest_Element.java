package com.Barath.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {10,1,2,5,7,6,9};
        System.out.println(findTheKthLargestElement(arr,3));
    }
    static int findTheKthLargestElement(int[] arr,int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) {
            maxHeap.add(i);
        }
        for (int i = 0;i < k - 1;i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}
