package com.Barath.Parenthesis;

public class Valid_Parenthesis {
    public static void main(String[] args) {
        System.out.println(findParenthesis("((((****"));
    }
    static boolean findParenthesis (String s) {
        int max = 0,min = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                max ++;
                min ++;
            }
            else if (c == ')') {
                max --;
                min --;
            }
            else {
                max ++;
                min --;
            }
            if (min < 0) min = 0;
            if (max < 0) return false;
        }
        return min == 0;
    }
}
