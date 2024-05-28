package com.mycompany.thirteen.finaldemo;

public /*final*/ class Fruit {
    String fruitColor;

    //final methods can't be overridden
    public final void display(){
        System.out.println("Fruit Parent Class");
    }
}
