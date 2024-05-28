package com.mycompany.eighteen.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args){

        //set does not maintain order of insertion
        Set<Integer> rolls = new HashSet<>(); //allows to add null values
        //TreeSet implements the SortedSet interface
        //Set<Integer> rolls = new TreeSet<>();
        //If we add null value it gives NullPointerException at the run time.

        rolls.add(1);
        rolls.add(5);
        rolls.add(3);
        rolls.add(99);

        rolls.add(null);

        for (int i=0; i<rolls.size(); i++){
            System.out.println(rolls);
        }

        for (Integer r: rolls){
            System.out.println(r);
        }

        System.out.println(rolls.size());
        rolls.add(3);
        rolls.add(99);

        System.out.println(rolls.size());

        rolls.remove(99);
        System.out.println(rolls.size());


    }
}
