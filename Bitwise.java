
package com.examly;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter a value for b: ");
        int b = sc.nextInt();

        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("NOT: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));

        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your email:");
        String email=sc.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);

        sc.close();
    }
}
