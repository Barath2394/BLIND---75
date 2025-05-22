package com.Barath.Maths;

public class LargestAmongThree {
    public static void main(String[] args) {
        System.out.println(large(3,6,5));
    }
    static int large(int a,int b,int c) {
        return (a > b && a > c) ? a : (b > c) ? b : c;
    }
}
