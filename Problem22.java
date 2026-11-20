package com.examly;

public class Problem22 {
    public static void main(String[] args){
        Employee e;
        e=new FullTimeEmp();
        e.calculatesalary();
        e=new PartTimeEmp();
        e.calculatesalary();
        e=new Employee();
        e.calculatesalary();
    }

    static class Employee {
        void calculatesalary(){
            System.out.println("salary is calculated");
        }
    }

    static class FullTimeEmp extends Employee {
        @Override
        void calculatesalary(){
            System.out.println("full time employee salary:35000");
        }
    }

    static class PartTimeEmp extends Employee {
        @Override
        void calculatesalary(){
            System.out.println("part time employee salary:12000");
        }
    }
}