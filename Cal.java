package com.examly;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in){
            boolean flag=true;
            while(flag){
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                char o= sc.next().charAt(0);
                switch(o){
                    case '+':
                        System.out.println(num1+num2);
                        break;
                    case '-':
                        System.out.println(num1-num2);
                        break;
                    case '*':
                        System.out.println(num1*num2);
                        break;
                    case '/':
                        if(num2!=0){
                            System.out.println(num1/num2);
                        }
                        else{
                            System.out.println("zero cannot by divide")
                        }
                        break;
                        
                    
                }

            }
        }
    }
}
