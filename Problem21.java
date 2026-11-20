package com.examly;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vehicle vc;
        vc = Car.ServiceCenter.getVehicle(n);
        vc.start();
        vc.service();
        if (vc instanceof Car) {
            ((Car) vc).carins();
        } else if (vc instanceof Bike) {
            ((Bike) vc).bikeins();

        }

    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle is start");
    }

    void service() {
        System.out.println("vehice is service");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("car is start");
    }

    void service() {
        System.out.println("car is service");
    }

    void carins() {
        System.out.println("car is Insure");
    }

    static class ServiceCenter {
        static Vehicle getVehicle(int choice) {
            if (choice == 1) {
                return new Car();
            } else if (choice == 2) {
                return new Bike();
            } else {
                return new Vehicle();
            }
        }
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("bike is start");
    }

    void service() {
        System.out.println("bike is service");

    }

    void bikeins() {
        System.out.println("bike is insu");
    }
}


