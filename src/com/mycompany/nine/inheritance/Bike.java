package com.mycompany.nine.inheritance;

public class Bike extends Vehicle {
    public Bike(){
        super("jifenkf");
        System.out.println("Default Constructor of Child class Bike");
        super.setVehicleType("Bike is Two Wheeler");

    }

    public void display(){
        System.out.println(super.getVehicleType());
        System.out.println(super.regNo);
    }

    //Method overriding
    @Override
    public void show(){
        System.out.println("I am child class Bike");
    }

}
