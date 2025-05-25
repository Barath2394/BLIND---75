package com.Barath.AdvancedDS.SlidingWindow;

import java.util.*;

public class LongestSubStringWithKUniqueChar {
    public static void main(String[] args) {
        System.out.println(findTheLongest("aaabbccdd", 2));  // Output should be 4 ("bcca" or "ccdd")
    }

    static int findTheLongest(String str, int k) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int l = 0, r = 0, maxLen = 0;

        while (r < str.length()) {
            mpp.put(str.charAt(r), mpp.getOrDefault(str.charAt(r), 0) + 1);

            // Shrink the window if the number of unique characters exceeds 'k'
            while (mpp.size() > k) {
                mpp.put(str.charAt(l), mpp.get(str.charAt(l)) - 1);
                if (mpp.get(str.charAt(l)) == 0) {
                    mpp.remove(str.charAt(l));
                }
                l++;
            }

            // Update the maximum length of the valid substring
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}

