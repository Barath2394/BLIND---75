package Arrays;
import java.util.*;
public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        rotateOne(arr,k);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void rotateOne(int[] arr, int k) {
        if(k < 0){
            k += arr.length;
        }
        else{
            k %= arr.length;
        }
        reverse(0,k-1,arr);
        reverse(k, arr.length-1,arr);
        reverse(0, arr.length-1,arr);
    }
    static void reverse(int start,int end,int[] arr){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}
