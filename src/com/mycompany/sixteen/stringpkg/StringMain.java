package com.mycompany.sixteen.stringpkg;

import com.mycompany.twelve.staticdemo.StaticPractice;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args)
    {
        String a1 = new String("ABC Pvt");
        String a2 = new String("ABC Pvt").intern();
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        String s1 = "John";
        String s2 = "John";
        String s3 = new String("John");
        String s4 = new String("John");
        String s5 = new String("John").intern();
        //Checking references using  == operator whether these references are pointing to the same object or not.

        if(s1 == s2){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }

        if(s1 == s3){
            System.out.println("s1 and s3 are equal");
        }
        else{
            System.out.println("s1 and s3 are not equal");
        }

        if(s4 == s3){
            System.out.println("s4 and s3 are equal");
        }
        else{
            System.out.println("s4 and s3 are not equal");
        }

        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal using equals method");
        }
        else{
            System.out.println("s1 and s2 are not equal using equals method");
        }

        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal using equals method");
        }
        else{
            System.out.println("s1 and s3 are not equal using equals method");
        }

        if(s4.equals(s3)){
            System.out.println("s4 and s3 are equal using equals method");
        }
        else{
            System.out.println("s4 and s3 are not equal using equals method");
        }

        if(s4.equalsIgnoreCase(s3)){
            System.out.println("s4 and s3 are equal using equalsIgnoreCase method");
        }
        else{
            System.out.println("s4 and s3 are not equal using equalsIgnoreCase method");
        }

        if(s1 == s5){
            System.out.println("s1 and 5 are equal");
        }
        else{
            System.out.println("s1 and s5 are not equal");
        }

        if(s2 == s5){
            System.out.println("s2 and 5 are equal");
        }
        else{
            System.out.println("s2 and s5 are not equal");
        }

        if(s3 == s5){
            System.out.println("s3 and 5 are equal");
        }
        else{
            System.out.println("s3 and s5 are not equal");
        }

        if(s4 == s5){
            System.out.println("s4 and 5 are equal");
        }
        else{
            System.out.println("s4 and s5 are not equal");
        }

        if(s1.equals(s5)){
            System.out.println("s1 and s5 are equal using equals method");
        }
        else{
            System.out.println("s1 and s5 are not equal using equals method");
        }

        if(s2.equals(s5)){
            System.out.println("s2 and s5 are equal using equals method");
        }
        else{
            System.out.println("s2 and s5 are not equal using equals method");
        }

        if(s3.equals(s5)){
            System.out.println("s3 and s5 are equal using equals method");
        }
        else{
            System.out.println("s3 and s5 are not equal using equals method");
        }

        if(s4.equals(s5)){
            System.out.println("s4 and s5 are equal using equals method");
        }
        else{
            System.out.println("s4 and s5 are not equal using equals method");
        }

        String string = "Hello World";
        String substring = string.substring(0,5);
        System.out.println(string);
        System.out.println(substring);

        String string1 = "Hello World";
        int index = string1.indexOf("World");
        System.out.println(index);

        String theString = "is this good or is this bad?";
        String substring1 = "is";
        int index1 = theString.lastIndexOf(substring1);
        System.out.println(index1);

        String text = "one two three two one";
        boolean matches =  text.matches(".*two.*");
        System.out.println(matches);

        String one = "This is a good day to code";
        System.out.println(one.startsWith("This"));
        System.out.println(one.startsWith("This", 5));//doubt
        System.out.println(one.startsWith("is", 5));//doubt
        System.out.println(one.endsWith("code"));
        System.out.println(one.endsWith("shower"));

        String one1 = "abc";
        String two1 = "def";
        String three1 = "abd";
        System.out.println(one1.compareTo(two1));
        System.out.println(one1.compareTo(three1));

        String text1 = "     And he ran across the field     ";
        System.out.println(text1);
        String trimmed = text1.trim();
        System.out.println(text1);
        System.out.println(trimmed);

        String source = "123abc";
        System.out.println(source);
        String replaced = source.replace('a','@');
        System.out.println(source);
        System.out.println(replaced);

        String a = "RAO";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.endsWith("a"));
        System.out.println(a.compareTo("I am Nicha"));//return type is integer
        System.out.println(a.compareToIgnoreCase("I am Nicha"));//return type is integer
        System.out.println(a.codePointAt(1));//unicode value
        System.out.println(a.concat("a"));
        String b = "rao";

        System.out.println(a.contains(b));
        System.out.println(a.toLowerCase().contains(b.toLowerCase()));
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking user input with the help of next()");
        String stringex1 = sc.next();
        System.out.println(stringex1+stringex1.length());
        System.out.println("Taking user input with the help of nextLine()");
        String stringex2 = sc.next();
        System.out.println(stringex2+stringex2.length());

        System.out.println("---------");
        sc.nextLine();
        String option4 =sc.nextLine();
        System.out.println("Do you want to update the Book Name, enter Y to update or N to skip");
        if(option4.toUpperCase()=="Y")
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Different");
        }
        StaticPractice.display();
    }

}
