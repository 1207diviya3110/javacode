package com.mycompany.twelve.staticdemo;

public class StaticPractice {
    static int a = 10;
    static int b;
    int empId = 555;

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    {
        b = a * 10;
    } //this will fail as we are not allowed to write code directly in class

    {
        System.out.println("I am a non static block");
    }

    public StaticPractice(){
        System.out.println("Default constructor called");
    }

    static void m1(){
        System.out.println("Inside m1");
    }

    public void show(){
        System.out.println("The value of a is "+this.a);
        System.out.println("Value of Employee ID is "+this.empId);
    }

    public static void display(){
        System.out.println("Value of a is: "+a);
    }

    public static void main(String[] args){
        System.out.println("from main");
        System.out.println("The value of a "+a);
        System.out.println("The value of b "+b);

        StaticPractice sp1 = new StaticPractice();
        sp1.a = 99;
        sp1.empId = 666;

        StaticPractice sp2 = new StaticPractice();
        System.out.println("The value of sp2.a is "+ sp2.a);
        System.out.println(StaticPractice.a);
        StaticPractice.display();
        display();
        System.out.println("Value of sp2.empid is"+sp2.empId);
    }
}
