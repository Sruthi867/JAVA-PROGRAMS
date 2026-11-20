package com.examly;

import java.util.Scanner;

public class Constructer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String location = sc.nextLine();
       // String course = sc.nextLine();
        Student s = new Student(name, location,"CSE");
        Student s1 = new Student(name, location);
        Student s2=new Student();
        s.displaystudent();
        System.out.println("----------");
        s1.displaystudent();

    }
}

class Student {
    private String name, location, course;

    Student(String name, String location, String course) {
        this.name = name;
        this.location = location;
        this.course = course;

    }
    Student(){
        System.out.println("constructor without parameter");
        name="niha";
        course="CSE";


    }

    void displaystudent() {
        System.out.println(name);
        System.out.println(location);
        System.out.println(course);

    }
}
