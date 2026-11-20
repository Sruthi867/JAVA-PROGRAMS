package com.examly;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int position=0;
    int proId[]=new int[n];
    for(int i=0;i<proId.length;i++){
        proId[i]=sc.nextInt();
    }
    int searchid=sc.nextInt();
    boolean found=false;
    for(int i=0;i<proId.length;i++){
        if(proId[i]==searchid){
            found=true;
            position=i+1;
            break;
        }
        else{
            found=false;
        }
    }
    if(found){
            System.out.println("productid:"+position);
        }else{
            System.out.println("product not found");
        }
    }
}