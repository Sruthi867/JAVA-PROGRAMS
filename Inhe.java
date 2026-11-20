package com.examly;
/**
 */
interface Mother{
    void displayMother();

    }
class Father {
    void displayFather() {
        System.out.println("fatger class");

    }
}

class Son extends Father implements Mother{
    public void displayMother(){
        System.out.println("mother class");
    }
 void displaySon(){
    System.out.println("son class");
 }
}

public class Inhe {
    public static void main(String[] args) {
        Son so=new Son();
        //so.displayFather();
        so.displayFather();
        so.displayMother();
        so.displaySon();
  
    }
}
