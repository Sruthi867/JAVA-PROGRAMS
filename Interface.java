package com.examly;

public class Interface {
    public static void main(String[] args){
        myinterface mi=new interfaceclass();
            mi.message();
            mi.newmessage();
            newinter ni=new interfaceclass();
            ni.newmessage();
            ni.message();

    }
}
interface myinterface extends newinter,anotherinter{
    void message();
}
interface newinter{
    void message();
    void newmessage();
}
interface anotherinter{
    void message();
    void newmessage();
}
class interfaceclass implements myinterface,newinter{
    public void message(){
        System.out.println("hello java");
    }

    @Override
    public void newmessage() {

    }
}
