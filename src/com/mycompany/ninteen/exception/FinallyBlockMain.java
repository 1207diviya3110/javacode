package com.mycompany.ninteen.exception;

public class FinallyBlockMain {
    public static void main(String[] ags){
        try{
            int data = 25/5;
            System.out.println(data);
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executes where exception occurred or not");
            System.out.println("Database connection closing, or File operation closing...");
        }
        System.out.println("rest of the code...");

        try{

        }
        finally {
            System.out.println("try with finally can exist");
        }
        try{
            System.exit(0);
        } finally {
            System.out.println("Finally block will not be executed as System.exit(0) is called");
        }
    }
}
