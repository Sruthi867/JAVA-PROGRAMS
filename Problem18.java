package com.examly;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter empid");
        int empid=sc.nextInt();
        sc.nextLine();
        System.out.println("enter emp name");
        String empname=sc.nextLine();
        System.out.println("enter emp sal");
        double empsal=sc.nextDouble();
        Employee e= new Employee();
        e.setEmpid(empid);
        e.setEmpname(empname);
        e.setEmpsal(empsal);
        double sal=e.getEmpsal();
        System.out.println(e.getEmpid());
        System.out.println(e.getEmpname());
        if(sal>0){
        System.out.println(e.getEmpsal());
        }else{
            System.out.println("invalid sal");
        }
        


        
    }
}
class Employee{
    private int empid;
    private String empname;
    private double empsal;
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public double getEmpsal() {
        return empsal;
    }
    public void setEmpsal(double empsal) {
        this.empsal = empsal;
    }
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", getEmpid()=" + getEmpid()
                + ", getEmpname()=" + getEmpname() + ", getEmpsal()=" + getEmpsal() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

        

    }
    
