package com.Barath.Parenthesis;

public class RemoveTheOuterParenthesis {
    public static void main(String[] args) {
        System.out.println(removeOuter("(()(()()()))"));
    }
    static String removeOuter(String str) {
        int balanced = 0;
        StringBuilder ans = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                if (balanced > 0) {
                    ans.append(c);
                }
                balanced ++;
            }
            else {
                balanced --;
                if (balanced > 0) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}
