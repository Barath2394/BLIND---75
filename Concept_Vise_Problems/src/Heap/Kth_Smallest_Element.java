package com.Barath.Heap;

import java.util.PriorityQueue;

public class Kth_Smallest_Element {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        System.out.println(findTheKthSmallest(arr,2));
    }
    static int findTheKthSmallest(int[] arr,int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : arr) {
            minHeap.add(i);
        }
        for (int i = 0;i < k - 1;i ++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
