package com.mycompany.five.controlstatements;

public class IfElseIfElse {
    public static void main(String[] args){
        double marks = 450.9;

        if(marks <= 500 && marks >= 400){
            System.out.println("Your grade is A");
        } else if (marks <= 399 && marks >= 200) {
            System.out.println("Your grade is B");
        } else {
            System.out.println("Your grade is C");
        }
    }
}
