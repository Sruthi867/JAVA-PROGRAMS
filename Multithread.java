package com.examly;

public class Multithread {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        mythread t=new mythread();
        anotherthread t1=new anotherthread();
        t.start();
        t.setName("bank app");
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
        System.out.println(t1.getName());
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());
        System.out.println(Thread.currentThread().getPriority());
        
        


    }
}
class mythread extends Thread{

   

}