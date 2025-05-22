package com.Barath.PascalTriangle;

import java.util.List;
import java.util.Scanner;

public class ThirdTypeOfQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of row : ");
        int rowN = sc.nextInt();
        for (int row=1;row<=rowN;row++){
            generateRows(row);
        }
    }
    static void generateRows(int row){
        int ans = 1;
        System.out.print(1 + " ");
        for (int col = 1;col < row;col ++){
            ans = ans * (row - col);
            ans = ans / col;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
