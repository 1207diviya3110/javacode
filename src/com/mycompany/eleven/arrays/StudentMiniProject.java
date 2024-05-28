package com.mycompany.eleven.arrays;

import java.util.Scanner;

public class StudentMiniProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        int numberOfStudents = scanner.nextInt();
        String arrayOfStudents[] = new String[numberOfStudents];

        for(int i =0 ; i< arrayOfStudents.length; i++){
                System.out.println("Please enter the name of "+(i+1)+" student");
                arrayOfStudents[i] = scanner.next();
        }

        for(int i =0 ; i< arrayOfStudents.length; i++){
            System.out.println("The name of "+(i+1)+" student is "+ arrayOfStudents[i]);
        }
    }
}
