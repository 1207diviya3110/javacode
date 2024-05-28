package com.mycompany.twentytwo.serdeserilaization;

import java.io.*;

public class DeserializationMain {
    public static void main(String[] args){
        String fileName = "file.ser";
        Product object1 = null;

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (Product) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");

            System.out.println("Product ID"+object1.getProductID());
            System.out.println("Product Name"+object1.getProductName());
            System.out.println("Product Price"+object1.getProductPrice());
        }
        catch (IOException ex){
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
