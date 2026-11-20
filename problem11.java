package com.examly;
import java.util.Arrays;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int copy[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(Arrays.equals(arr,arr1)){
            System.out.println("both marks are equal");
        }
        else{
            System.out.println("marks are different");
        }
        copy=Arrays.copyOf(arr,n);
        Arrays.sort(copy);
        for(int i:copy){
            System.out.println();
        }
    }
    
}
