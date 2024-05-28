package com.mycompany.sixteen.stringpkg;

public class StringBuilderMain {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Nitya");
        String s1 = sb.toString();

        System.out.println(sb);
        System.out.println(s1);
        sb.append(" ");
        sb.append("Sathvika");
        System.out.println(sb);

        sb.insert(4,"AA");
        System.out.println(sb);

        System.out.println(sb.replace(4,7,"aa")
);

    }
}
