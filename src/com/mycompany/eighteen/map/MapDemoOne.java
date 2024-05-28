package com.mycompany.eighteen.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemoOne {
    public static void main(String[] a){

        Map<Integer, String> mapOfEmployee = new HashMap<>();

        mapOfEmployee.put(111,"Nicha");
        mapOfEmployee.put(112, "Diya");
        mapOfEmployee.put(113, "Deepu");
        mapOfEmployee.put(114, "Chinni");
        mapOfEmployee.put(null, null);
        mapOfEmployee.put(null, null);

        mapOfEmployee.put(117, null);

        for (Map.Entry<Integer, String> m: mapOfEmployee.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            if(m.getValue()!=null && m.getValue().equals("Nicha")){
                System.out.println("Nicha found at Key : "+ m.getKey());
            }
        }

        System.out.println(mapOfEmployee.get(113));
        System.out.println(mapOfEmployee.size());

    }
}
