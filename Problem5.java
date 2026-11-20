package com.examly;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter initial amount balance");
        int accbal=sc.nextInt();
        System.out.println("Enter withdrawl amount:");
        int withdrawt=sc.nextInt();
        int crrbal=0;
        if(accbal>0 && withdrawt>0)
        if(withdrawt>=100&&withdrawt%100==0&&withdrawt<=accbal){
            crrbal=accbal-withdrawt;
            System.out.println("initial balance:"+accbal);
            System.out.println("withdrawl amount:"+withdrawt);
            System.out.println("transaction status:successfull");
            System.out.println("remainig balance:"+crrbal);

        }else{
            System.out.println("initial balance:"+accbal);
            System.out.println("withdrawl amount:"+withdrawt);
            System.out.println("transaction status: not successfull");
            System.out.println("remainig balance:"+accbal);

        }
    }
}
