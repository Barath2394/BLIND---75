package com.Barath.Maths;

public class FindTheFactors {
    public static void main(String[] args) {
        System.out.println(func(4));
    }
    static int func(int n) {
        int totSum = 0;
        for (int i=1;i<=n;i++) {
            totSum += fact(i);
        }
        return totSum;
    }
    static int fact(int num) {
        int sum = 0;
        for (int i=1;i<=num;i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
