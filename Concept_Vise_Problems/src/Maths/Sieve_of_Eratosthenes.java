package com.Barath.Maths;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        System.out.println(findPrimes(30));
    }
    static int findPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] prime = new boolean[n];
        for (int i=2;i<n;i++) {
            prime[i] = true;
        }
        for (int i=2;i*i<n;i++) {
            if (prime[i] == true) {
                for (int j=i*i;j<n;j+=i) {
                    prime[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i=2;i<n;i++) {
            if (prime[i]) {
                cnt ++;
            }
        }
        return cnt;
    }
}