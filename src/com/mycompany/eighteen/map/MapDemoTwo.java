package com.mycompany.eighteen.map;

import com.mycompany.eighteen.list.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemoTwo {
    public static void main(String[] a){

        Map<Long, Employee> mapOfEmployee = new HashMap<>();

        //nesting
        Map<Long, List<Employee>> mapOfEmployeeList = new HashMap<>();

        Map<Long, Map<String, Employee>> mapOfMapEmployee = new HashMap<>();

        Employee emp = new Employee();
        emp.setEmpName("Nicha");
        emp.setEmpId(111L);
        mapOfEmployee.put(emp.getEmpId(), emp);

        emp = new Employee();
        emp.setEmpId(112L);
        emp.setEmpName("Sathvika");
        mapOfEmployee.put(emp.getEmpId(), emp);

        Employee resultEmp = mapOfEmployee.get(111L);
        System.out.println(resultEmp.getEmpName());

        for (Map.Entry<Long, Employee> m: mapOfEmployee.entrySet()){
            System.out.println("Emp ID is "+m.getKey()+" Emp name is "+ m.getValue().getEmpName());
            System.out.printf("Emp Id is %d Emp Name is %s",m.getKey(), m.getValue().getEmpName());
            System.out.println();
        }

    }
}
