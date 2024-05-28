package com.mycompany.ninteen.exception;

import java.io.IOException;

public class CustomExceptionMain {
    static void validate(int age) throws InvalidAgeException, IOException {
        if (age < 18) {
            InvalidAgeException ia = new InvalidAgeException("not valid");
            ia.setErrorCode("AGE_001_NOT_SATISFIED");
            throw ia;
        } else {
            System.out.println("Welcome to vote");
        }
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            validate(14);
            System.out.println("not reachable");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getErrorCode());
            System.out.println("you are not allowed to vote because you are less than 18 years" + e);
        }
        catch (IOException i) {
            System.out.println("IO Exception "+i);
        }
        catch (Exception m ){
            System.out.println("Exception occurred: "+m);
        }
        System.out.println("Rest of the code");
    }
}
