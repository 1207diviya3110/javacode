package com.mycompany.six.objectclasses;

public class Employee {


        long employeeID; // state variable
        double salary; // state variable

        //behaviors
        void setEmployeeID(long eid)
        {
            employeeID=eid;
        }

        void setSalary(double s){
            salary=s;
        }
        long getEmployeeID(){
            return employeeID;
        }
        double getSalary(){
            return salary;
        }

    @Override
    public String toString(){
            String s = employeeID + " " + salary;
            return s;
    }
}

