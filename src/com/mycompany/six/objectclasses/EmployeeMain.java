package com.mycompany.six.objectclasses;

public class EmployeeMain {
    public static void main(String[] args){
        Employee nitya = new Employee();
        System.out.println(nitya.getEmployeeID());
        System.out.println(nitya.getSalary());
        System.out.println("--------After setting the instance variables--------");
        nitya.setEmployeeID(123L);
        nitya.setSalary(5757.7);
        System.out.println(nitya.getEmployeeID());
        System.out.println(nitya.getSalary());
    }
}
