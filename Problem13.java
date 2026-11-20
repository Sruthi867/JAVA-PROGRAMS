package com.examly;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean isValid=true;
        if(s.charAt(0)=='p'&&s.length()==6){
            for(int i=1;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    isValid=false;
                    break;

                }
            }

        }
        else{
                isValid=false;
            }
        if(isValid){
            System.out.println("product is valid");
        }
        else{
            System.out.println("invalid product");
        }
    }
}
