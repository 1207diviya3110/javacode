package com.mycompany.ninteen.exception;

public class Exception4Main {
    public static void main(String[] args){
        calculate(5,2);
        calculate(5,0);
    }
    public static int calculate(int a, int b){
        int c = 0;
        try{
            c = a/b;
            System.out.println(c);
        }
        finally {
            System.out.println("Inside finally");
        }


        System.out.println("Exiting calculate function");

        return c;
    }
}
