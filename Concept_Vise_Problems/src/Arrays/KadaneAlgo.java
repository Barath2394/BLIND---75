package Arrays;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,-5,3,4};
        System.out.println(findMaxSum(arr));
    }
    static int findMaxSum(int[] arr) {
        int sum = 0,max = 0;
        for (int i=0;i< arr.length;i++) {
            if (sum >=0) {
                sum += arr[i];
            }
            else {
                sum = arr[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
