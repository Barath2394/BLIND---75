package com.Barath.AdvancedDS.SlidingWindow;

import java.util.*;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(findTheLongestLength(s));
    }
    static int findTheLongestLength(String s) {
        int l = 0,r = 0,maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()-1) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen,r-l+1);
            r ++;
        }
        return maxLen;
    }
}
