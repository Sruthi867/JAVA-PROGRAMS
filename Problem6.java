package com.examly;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<1||n>100){
        System.out.println("invalid student count:");
        return;
    }
    int marks[]=new int[n];
    int total=0;
    int highest=0;
    int lowest=0;
    int passed=0;
    int failed=0;

    for(int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt();
        if(marks[i]<0||marks[i]>100){
            System.out.println("invalid marks:");
            break;
        }
        total=total+marks[i];

    }
    highest=marks[0];
    lowest=marks[0];
    for(int i=0;i<marks.length;i++){
        if(highest<marks[i]){
            highest=marks[i];
        }
        if(lowest>marks[i]){
            lowest=marks[i];
        }
        if(marks[i]>40){
            passed++;
        }
        if(marks[i]<40){
            failed++;
        }
    }
    double avg=(double) total/n;

    System.out.println("total:"+total);
    System.out.println("avg:"+avg);
    System.out.println("High:"+highest);
    System.out.println("low:"+lowest);
    System.out.println("pass:"+passed);
    System.out.println("fail:"+failed);


}
}
