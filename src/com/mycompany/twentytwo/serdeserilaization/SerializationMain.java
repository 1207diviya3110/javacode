package com.mycompany.twentytwo.serdeserilaization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args){
        Product object = new Product(1, "Rubber", 20.0);

        String fileName = "File.ser";

        try{
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch (IOException e){
            System.out.println("IO Exception is caught");
        }
    }
}
