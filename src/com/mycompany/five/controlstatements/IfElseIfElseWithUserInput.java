package com.mycompany.five.controlstatements;

import java.util.Scanner;

public class IfElseIfElseWithUserInput {
    public static void main(String[] args){
        System.out.println("Enter your marks");
        Scanner scanner = new Scanner(System.in);
        double marks = scanner.nextDouble();

        if(marks <= 500 && marks >= 400){
            System.out.println("Your grade is A");
        } else if (marks <= 399 && marks >= 200) {
            System.out.println("Your grade is B");
        } else {
            System.out.println("Your grade is C");
        }
    }
}
