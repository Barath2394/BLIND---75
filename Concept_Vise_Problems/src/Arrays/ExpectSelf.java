package Arrays;

public class ExpectSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = product(arr);
        for (int i : res){
            System.out.print(i + " ");
        }
    }

    private static int[] product(int[] arr) {
        int n = arr.length;
        int pre = 1;
        int post = 1;
        int[] res = new int[n];
        for (int i=0;i<n;i++){
            res[i] = 1;
        }
        for (int i=0;i<n;i++){
            res[i] *= pre;
            pre *= arr[i];
        }
        for (int i=n-1;i>=0;i--){
            res[i] *= post;
            post *= arr[i];
        }
        return res;
    }

}
