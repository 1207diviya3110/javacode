package com.mycompany.five.controlstatements;

public class IfCondition {
    public static void main(String[] args){
        int age = 18;

        if(age >= 18){
            System.out.println("Allowed for voting");
        }
        if(age < 18) {
            System.out.println("Not allowed for voting");
        }
    }
}
