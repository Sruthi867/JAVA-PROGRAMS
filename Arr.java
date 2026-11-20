package com.examly;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args){
        int array[]={25,68,89,90};
        for(int i=0;i<array.length;i++){
            if(!(i%2==0)){
                System.out.println(array[i]);
            }
        }
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the count:");
        int n=sc.nextInt();
        int marks[]=new int[n];
        System.out.println("enter array values:");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
            System.out.println("array values:");
            for(int i=0;i<marks.length;i++){
                System.out.println(marks[i]);
            }

        }


    }
