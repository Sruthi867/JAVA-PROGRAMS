package com.examly;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rectangle re=new Rectangle();
        double length=sc.nextDouble();
        double breadth=sc.nextDouble();
        double Area=re.calculateArea(length, breadth);
        System.out.println(Area);
        double parimeter=re.calculateParameter(length, breadth);
        System.out.println(parimeter);
    }
}
    class Rectangle{
        double length;
        double breadth;
        double calculateArea(double length,double breadth){
            return (length*breadth);
        }
        double calculateParameter(double length,double breath){
            return 2*(length*breadth);
        }

    }
