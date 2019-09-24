package com.stackroute.main;

public class MainThrowException extends Exception {
    public MainThrowException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try{
            throw new MainThrowException("Exception occurred in main method.");
        }catch (MainThrowException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this is a finally block.");
        }
        System.out.println("this is after try-catch-finally block.");
    }
}
