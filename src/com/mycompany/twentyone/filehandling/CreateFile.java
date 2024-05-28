package com.mycompany.twentyone.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try{
            File myObj = new File("Demo.txt");


            if(myObj.createNewFile()){

                System.out.println("File created: "+myObj.getName());
                System.out.println("File path: "+myObj.getPath());
                System.out.println("File path: "+myObj.getAbsolutePath());
                System.out.println("File path: "+myObj.getCanonicalPath());
            }
            else {
                System.out.println("File already exists");
                System.out.println("File path: "+myObj.getPath());
                System.out.println("File path: "+myObj.getAbsolutePath());
                System.out.println("File path: "+myObj.getCanonicalPath());
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
