package com.mycompany.twenty.threads;

public class ThreadDemoOne extends Thread{
    @Override
    public void run(){
        int a = 10;
        int b =12;
        int output = a+b;
        System.out.println("Thread started and it's running");
        System.out.println("Sum is "+output);

    }
}
