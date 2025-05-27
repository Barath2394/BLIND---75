package com.Barath.Parenthesis;
import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     char[] ans = new char[2*n];
     ArrayList<String> all = new ArrayList<>();
     func(all,ans,0,0,0,n);
     System.out.println(all);
   }
   static void func(List<String> all,char[] ans,int o,int c,int i,int n) {
        if (i == ans.length) {
            all.add(new String(ans));
            return;
        }
        if (o < n) {
            ans[i] = '(';
            func(all,ans,o+1,c,i+1,n);
        }
        if (c < o) {
            ans[i] = ')';
            func(all,ans,o,c+1,i+1,n);
        }
   }
}
