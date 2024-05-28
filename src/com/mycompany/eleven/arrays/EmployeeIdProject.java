package com.mycompany.eleven.arrays;

import java.util.Scanner;

public class EmployeeIdProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Please enter the number of employees in your company ");
        int numberOfEmployees = scanner.nextInt();
        int[] arrayOfEmployees = new int[numberOfEmployees];


        //logic to take input from keyboard and store it in Array

        for (int i=0; i<arrayOfEmployees.length; i++){
            System.out.println("Enter the EmployeeId of "+(i+1)+" employee");
            arrayOfEmployees[i] = scanner.nextInt();
        }

        //printing all employee ids

        for(int i = 0; i < arrayOfEmployees.length; i++ ){
            System.out.println("Employee ID of Employee "+(i+1)+" is "+arrayOfEmployees[i]);
        }
    }
}
