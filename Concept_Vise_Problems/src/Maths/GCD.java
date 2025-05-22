package com.Barath.Maths;

public class GCD {
    public static void main(String[] args) {
        System.out.println(findGcd(2,3));
    }
    static int findGcd(int num1,int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            }
            else {
                num2 %= num1;
            }
        }
        return num1 !=0 ? num1 : num2;
    }
}
