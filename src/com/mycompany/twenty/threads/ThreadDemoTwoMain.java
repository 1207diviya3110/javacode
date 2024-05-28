package com.mycompany.twenty.threads;

public class ThreadDemoTwoMain {
    public static void main(String[] args){
        new ThreadDemoTwo("1st Thread");
        new ThreadDemoTwo("2nd Thread");
        new ThreadDemoTwo("3rd Thread");

        try{
            Thread.sleep(8000);

        }catch (InterruptedException e){
            System.out.println("Interruption occurs in main thread");
        }
        System.out.println("We are exiting main thread");
    }
}
