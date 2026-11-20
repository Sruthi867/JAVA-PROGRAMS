package com.examly;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int productPrice=1250;
        int quantity=4;
        int discount=500;
        int totalAmount = productPrice * quantity;
        System.out.println("Total amount: " + totalAmount);
        int finalAmount = totalAmount>2000? totalAmount-discount:totalAmount;
        System.out.println(finalAmount);
        System.out.println(finalAmount>4000);
        int age=25;
        int salary=30000;
        int percentage=85;
        System.out.println("Age Employee:"+(age>21));
        System.out.println(salary>=25000);
        System.out.println(percentage>=80);
        System.out.println(age>21&&salary>=25000&&percentage>=80);
        int a=10;
        int b=20;
        int sum=a+50;
        int sum2=b-20;
        System.out.println(!(sum==sum2||sum>30));
        int unary=100;
        System.out.println(unary++);
        System.out.println(unary);
        //conditions
        if(true){
            System.out.println("if is working");
        }
        else if(true){
            System.out.println("else if is working");
        }
        else{
            System.out.println("nothing is working");
        }
        //bitwise operator
        int x=5;
        int y=3;
        System.out.println("AND:"+(x&y));
        System.out.println("OR:"+(x|y));
        //array
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println("For each: " + i);
        }
        //calculator
        boolean falg=true;
        while(flag){
            int num1=sc.nextInt();
            int num2=
        }
    }
}

