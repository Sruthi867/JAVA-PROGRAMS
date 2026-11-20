package com.examly;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary:");
        float salary=sc.nextFloat();
        System.out.println("enter rating:");
        int rating=sc.nextInt();
        float bonus=0;
        if(salary>20000){
            if(rating==5){
                bonus=0.2f*salary;
            }
            else if(rating==4){
                bonus=0.15f*salary;

            }else if(rating==3){
                bonus=0.1f*salary;
            }
            else{
                System.out.println("not eligible for bonus");
            }
        }
        System.out.println("monthly salary:"+salary);
        System.out.println("bonus:"+bonus);
        System.out.println("final salary:"+salary);
        if(bonus==0){
            System.out.println("bonus eligible:no");
        }else{
            System.out.println("bonus eligible:yes");

        }

    }
}
