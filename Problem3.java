package com.examly;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double units=sc.nextInt();
        int fixedcharge=100;
        double elecbill;
        double finalbill;
        if(units<=100){
            elecbill=units*2.00;
        }else if(units>100&&units<=200){
            elecbill=100*2.00+((units-100)*3.50);
        }else{
            elecbill=100*2.00+100*3.50+(units-200*5.00);
        }
        finalbill=elecbill+fixedcharge;
        System.out.println(units);
        System.out.println(elecbill);
        System.out.println(fixedcharge);
        System.out.println(finalbill);



        }
    }
