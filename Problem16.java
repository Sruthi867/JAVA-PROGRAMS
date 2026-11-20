package com.examly;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        int empid = sc.nextInt();
        sc.nextLine();
        String empname = sc.nextLine();
        double empsal = sc.nextDouble();
        e.empid = empid;
        e.empname = empname;
        e.empsal = empsal;
        e.calculatesa();

    }
}

class Employee {
    int empid;
    String empname;
    double empsal;

    void calculatesa() {
        double HRA = 0.2 * empsal;
        double DA = 0.1 * empsal;
        double totalsal = empsal + HRA + DA;
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(empsal);
        System.out.println(HRA);
        System.out.println(DA);
        System.out.println(totalsal);
    }

}
