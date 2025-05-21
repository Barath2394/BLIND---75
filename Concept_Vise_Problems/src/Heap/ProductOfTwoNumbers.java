package com.Barath.Heap;
import java.util.*;
public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,7,0};
        System.out.println(findMaxProd(arr));
    }
    static int findMaxProd(int[] arr) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) {
            maxHeap.add(i);
        }
        int maxProduct = 1;
        for (int i = 0; i < 2; i++) {
            maxProduct *= maxHeap.peek();
            maxHeap.poll();
        }
        return maxProduct;
    }
}
