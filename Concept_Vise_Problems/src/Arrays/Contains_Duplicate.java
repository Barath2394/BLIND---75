package Arrays;

import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        boolean res = tech(arr);
        System.out.println(res);
    }
    static boolean tech(int[] arr){
        HashSet<Integer> dp = new HashSet<>();
        for (int i : arr){
            if (!dp.add(i)){
                return true;
            }
        }
        return false;
    }
}
