package com.mycompany.eighteen.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemoTwo {
    public static void main(String[] a){

        List<String> fruitList = new ArrayList<String>();

        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Papaya");

        fruitList.add(null);

        System.out.println(fruitList.get(1));

        fruitList.add(1,"Grapes");
        System.out.println(fruitList.get(2));
        System.out.println(fruitList.size());
        fruitList.remove("Apple");
        fruitList.set(2,"Orange");


        for (String f: fruitList){
            System.out.println(f);
        }

        if(fruitList.contains("Mango")){
            System.out.println("Its present");
        } else {
            System.out.println("Its not present");
        }

        if(fruitList.isEmpty()){
            System.out.println("Its empty");
        } else {
            System.out.println("It's not empty");
        }

        fruitList = new LinkedList<>(); //dynamic polymorphism
    }

}
