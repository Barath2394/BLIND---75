package com.Barath.Parenthesis;

public class FindTheMissingNos {
    public static void main(String[] args) {
        System.out.println(func("((())"));
    }
    static int func(String str) {
        int balanced = 0;
        int needed = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                balanced ++;
            }
            else if (c == ')') {
                balanced --;
            }
            if (balanced < 0) {
                needed ++;
                balanced = 0;
            }
        }
        return balanced + needed;
    }
}
