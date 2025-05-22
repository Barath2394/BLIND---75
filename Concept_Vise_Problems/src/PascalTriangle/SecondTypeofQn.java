package com.Barath.PascalTriangle;

import java.util.Scanner;

public class SecondTypeofQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = sc.nextInt();
//        BrutegenerateTheRowElements(row);
        OptimalgenerateTheRowElements(row);
    }
    static void BrutegenerateTheRowElements(int row){
        for (int col=1;col<=row;col++){
            System.out.print(findTheElement(row-1, col-1) + " ");
        }
    }
    static int findTheElement(int n,int r){
        int res = 1;
        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
    static void OptimalgenerateTheRowElements(int row){
        int ans = 1;
        System.out.print(1 + " ");
        for (int col = 1;col < row;col ++){
            ans = ans * (row - col);
            ans = ans / col;
            System.out.print(ans + " ");
        }
    }
}
