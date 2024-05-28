package com.mycompany.sixteen.stringpkg;

public class CompareTo {
    public static void main(String[] args){

        String s1 = "apple";
        String s2 = "banana";
        String s3 = "cat";
        String s4 = "apple";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s2.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s3.compareTo(s1));

    }
}
