package com.examly;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        int high=0;
        int low=0;
        int count=0;
        int sal[]=new int[n];
        for(int i=0;i<sal.length;i++){
            sal[i]=sc.nextInt();
            total+=sal[i];
        }
        high=sal[0];
        low=sal[0];
        for(int i=0;i<sal.length;i++){
            if(sal[i]>high){
               high=sal[i]; 
            }
            if(sal[i]<low){
                low=sal[i];
            }
            if(sal[i]>=30000){
                count++;
            }
        }
            System.out.println("total:"+total);
            System.out.println(high);
            System.out.println(low);
            System.out.println(count);

        }

    }

