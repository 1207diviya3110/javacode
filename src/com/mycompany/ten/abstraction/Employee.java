package com.mycompany.ten.abstraction;

public abstract class Employee {
    private String companyName = "Nicha Private Limited";

    //this is concrete method because it has a body or method implementation;

    public String getCompanyName(){
        return this.companyName;
    }

    public abstract double calculateSalary(String employmentType);


}
