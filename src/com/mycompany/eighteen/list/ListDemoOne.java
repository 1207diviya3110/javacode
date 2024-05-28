package com.mycompany.eighteen.list;

import java.util.ArrayList;

public class ListDemoOne {
    public static void main(String[] args){

        ArrayList numberList = new ArrayList();
        numberList.add("Yellow Ball");
        numberList.add("Blue Ball");
        numberList.add("Yellow Ball");
        numberList.add("Pink Ball");
        numberList.add("Purple Ball");
        numberList.add(99.87);
        numberList.add("Blue Ball");

        for (int i =0; i<numberList.size(); i++){
            System.out.println("Color Balls: "+numberList.get(i));
        }

        for (Object a: numberList){
            System.out.println("Color Balls: "+a);
            // System.out.println("Color Balls: "+a.getClass());
        }
    }
}
