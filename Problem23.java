package com.examly;

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Vehicles ob;
        ob=VehicleFactory.getVehicle(s);
        ob.start();
    }
    
}
class Vehicles{
    void start(){
        System.out.println("vehicle is started");
    }

}
class Car extends Vehicles{
    void start(){
        System.out.println("car is started");
    }
}
class bike extends Vehicles{
    void start(){
        System.out.println("bike is started");
    }
}
class Truck extends Vehicles{
    void start(){
        System.out.println("truck is started");
    }
}
class VehicleFactory{
    static Vehicles getVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        }
        else if(type.equalsIgnoreCase("Bike")){
            return new bike();
        }
        else if(type.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        else{
            return null;
        }


    }

}