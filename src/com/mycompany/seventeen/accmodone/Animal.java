package com.mycompany.seventeen.accmodone;

public class Animal {
    private String animalName = "Fox";
    protected boolean canFly;
    String animalType;

    public String getAnimalName(){
        System.out.println(this.animalName);
        System.out.println(this.canFly);
        System.out.println(this.animalType);

        return this.animalName;
    }
}
