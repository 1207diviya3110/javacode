package com.mycompany.eighteen.list;

import java.util.ArrayList;

public class GenericsListDemo {
    public static void main(String[] args){
        ArrayList<Integer> empIdList = new ArrayList<Integer>();

        ArrayList<String> nameList = new ArrayList<String>();

        empIdList.add(23);

        nameList.add("Nitya");
        nameList.add("Sathvika");

        for (String n: nameList){
            System.out.println(n);
        }

        for (Integer i: empIdList){
            System.out.println(i);
        }
    }
}
