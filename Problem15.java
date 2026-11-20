package com.examly;

public class Problem15 {
    void empdetails(){
        System.out.println("employee management system");
    }
    void empdetails(String name){
        System.out.println(name);
    }
    String empdetails(String name,int id){
        return "Name:" +name+ ", id: " +id;
    }
    int calculateSal(){
        return 50000;
    }
    public static void main(String[] args){
        Problem15 p=new Problem15();
        p.empdetails();
        p.empdetails("sruthi");
        System.out.println(p.empdetails("sruthi",2));
        System.out.println(p.calculateSal());


    }
}
