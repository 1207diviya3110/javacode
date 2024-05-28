package com.mycompany.four.loops;

public class ForLoop {
    public static void main(String[] args){
        for (int i = 1; i <= 101; i++){
            System.out.println(i);
        }
        System.out.println("------------------------");
        for(int i = 101; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("------------------------");
        int oddNumSum = 0;
        for(int i = 101; i >= 1; i-- ){
            if(i%2 == 0){
                oddNumSum += i;
                System.out.println(oddNumSum);
            }
        }
        System.out.println("Sum of Odd numbers is" + oddNumSum);
    }
}
