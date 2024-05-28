package com.mycompany.ninteen.exception;

import java.awt.*;

public class Exception2Main {
    public static void main(String[] a){
        String s1 = "Hey this is valid string";
        String s2 = null;

        displayLength(s1);
        displayLength(s2);
    }

    public static void displayLength(String s){
        try{
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println("Null pointer exception");
        }
    }
}
