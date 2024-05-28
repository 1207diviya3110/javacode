package com.mycompany.twentyone.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("Demo.txt");
            myWriter.write("Java is the prominent programming language");


            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            myWriter.close();
        }
    }
}
