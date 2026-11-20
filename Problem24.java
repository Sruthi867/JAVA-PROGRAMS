package com.examly;

public class Problem24 {
    public static void main(String[] args) {

        Employ e = new employeedetails();

        e.getemployeedetails();
        e.calculatesalary();
        e.displaydepartment();
    }
}

interface Employ {

    void getemployeedetails();

    void calculatesalary();

    void displaydepartment();
}

class employeedetails implements Employ {

    String name = "sruthi";
    int id = 101;
    double salary = 40000;
    double bonus = 5000;
    double totalsal;
    String dept = "CSE";

    @Override
    public void getemployeedetails() {

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public void calculatesalary() {

        totalsal = salary + bonus;

        System.out.println("Total Salary: " + totalsal);
    }

    @Override
    public void displaydepartment() {

        System.out.println("Department: " + dept);
    }
}