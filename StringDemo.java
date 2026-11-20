package com.examly;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String val=new String("hello");
        System.out.println(s+""+val);
        System.out.println(s.equals(val));
        System.out.println(s==val);
        String newval=sc.nextLine();
        System.out.println(s);
    }
}
