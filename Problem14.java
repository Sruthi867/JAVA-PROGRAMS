package com.examly;

public class Problem14 {
    void display(){
        System.out.println("welcome to student information system");
    }
    void display(String name){
        System.out.println("welcome "+name);
    }
    String display(String name,int age){
        return "Name:"+ name+ ", age :"+age;
    }
    int calculateDisplay(){
        return 19;
    }
    public static void main(String[] args){
        Problem14 p=new Problem14();
        p.display();
        p.display("sruthi");
        System.out.println(p.display("sruthi",19));
        System.out.println(p.calculateDisplay());

    }
    
}
