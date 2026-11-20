package com.examly;

public class Problem20 {
    public static void main(String[] args) {
        Empl em;
        em=new Empl();
        em.work();
        em.salary();
        em=new Developer();
        em.work();
        em.salary();
        em=new Trainer();
        em.work();
        em.salary();
    }
    
}
class Empl{
    void work(){
        System.out.println("displays emp is working");
    }
    void salary(){
        System.out.println("displays emp salary");
    }
}
class Developer extends Empl{
    void work(){
        System.out.println("displays trainer is working");
    }
    void salary(){
        System.out.println("displays trainer salary");
    }
}
class Trainer extends Empl{
    void work(){
        System.out.println("displays developer is working");
    }
    void salary(){
        System.out.println("displays Developer salary");
    }
}