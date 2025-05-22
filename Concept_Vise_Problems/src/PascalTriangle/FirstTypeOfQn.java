package com.Barath.PascalTriangle;

import java.util.Scanner;

public class FirstTypeOfQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = sc.nextInt();
        System.out.print("Enter the col : ");
        int col = sc.nextInt();
        int ans = findTheElement(row-1,col-1);
        System.out.println("The element in the " + row + "'th row " + col + "'th col is : " + ans);
    }
    static int findTheElement(int n,int r){
        int res = 1;
        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
}
