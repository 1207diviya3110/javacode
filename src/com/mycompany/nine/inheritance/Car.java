package com.mycompany.nine.inheritance;

public class Car extends Vehicle{

    public long buildNumber;
    public Car(){
        System.out.println("Default Constructor of Child Class Car");
        super.setVehicleType("Car is Four Wheeler");
    }

    public Car(long buildNumber){
        this();
        this.buildNumber = buildNumber;
    }

    public Car(String a, long xyz){
        this(7L);
    }

    public void showDetails(){
        System.out.println(getVehicleType());
        System.out.println("Build Number of car is"+this.buildNumber);
    }

    @Override
    public void show(){
        System.out.println("I am child class Car");
    }
}
