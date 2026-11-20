package com.examly;

public class Inheritence {
    public static void main(String[] args){
        Child ch=new Child();
        ch.meth();
        System.out.println(ch.name);
        ch.meth1();
        Grandchild gc=new Grandchild();
        gc.meth();
        gc.meth1();
        gc.meth2();

    }
}
class Parent{
    String name="hello";
    void meth(){
        System.out.println("from parent class");
    }
}
class Child extends Parent{
    String name="from child class";
    void meth1(){
        String nm=super.name;
        System.out.println(nm);
    }
}
class Grandchild extends Child{
    String name="from child class";
    void meth2(){
        System.out.println("from grandchild class");
    }
}