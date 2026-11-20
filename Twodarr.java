package com.examly;

import java.util.Scanner;

public class Twodarr {
    public static void main(String[] args){
        // int arr[][]={
        //     {10,20,30},
        //     {78,45,78},
        //     {22,98,55}
        // };
        // System.out.println(arr[2][1]);
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.println(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter Array elements:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }




    }

    
}
