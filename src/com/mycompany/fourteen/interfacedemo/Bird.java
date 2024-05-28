package com.mycompany.fourteen.interfacedemo;

public class Bird implements Animal, SuperAnimal {
    @Override
    public void speak(){
        System.out.println("Chirp!!");
    }
}
