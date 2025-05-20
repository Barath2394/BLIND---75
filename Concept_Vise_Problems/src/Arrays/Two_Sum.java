package Arrays;

import java.util.*;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = findTheInd(nums , target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    static int[] findTheInd(int[] nums,int target) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mpp.containsKey(diff)) {
                return new int[] {mpp.get(diff) , i};
            }
            mpp.put(nums[i] , i);
        }
        return new int[] {};
    }
}
