package com.examly;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int productid[]=new int[n];
            for(int i=0;i<productid.length;i++){
                productid[i]=sc.nextInt();
            }
            int searchid=sc.nextInt();
            Arrays.sort(productid);
            int res=Arrays.binarySearch(productid,searchid);
            if(res>=0){
                System.out.println("product found at position:"+(res+1));
            }else{
                System.out.println("product not found");
            }
        }
    }
