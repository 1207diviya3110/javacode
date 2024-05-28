package com.mycompany.eight.constructor;

public class Shape {
    int length;
    int breadth;
    String shapeType; //default value is null

    public Shape(){
        System.out.println("Default Constructor");
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeType);
    }

    public Shape(int length,String shapeType){
        this.length = length;
        this.shapeType = shapeType;
        System.out.println(this.length);
        System.out.println(this.breadth);
        System.out.println(this.shapeType);
        System.out.println("Two parameterised overloaded constructor");

    }

    public Shape(int length,String shapeType, int breadth){
        this.length = length;
        this.shapeType = shapeType;
        this.breadth = breadth;
        System.out.println(this.length);
        System.out.println(this.breadth);
        System.out.println(this.shapeType);
        System.out.println("Three parameterised overloaded constructor");
        this.test();
    }

    public void test(){
        System.out.println("This is test method");
    }

    class InnerShape {

        int metrics = 6789;

        void display(){
            System.out.println("Inner Class");
            System.out.println(metrics);
        }
    }
}
