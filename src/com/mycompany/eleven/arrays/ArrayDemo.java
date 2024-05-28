package com.mycompany.eleven.arrays;

public class ArrayDemo {
    public static void main(String[] args){
        int arrayofAadhar[] = new int[5];
        System.out.println(arrayofAadhar[3]);
        //output will be 0 as default value of int is zero
        arrayofAadhar[3] = 12345;
        for(int i=0; i<arrayofAadhar.length; i++){
            System.out.println(arrayofAadhar[i]);
        }

        //enhanced for loop
        for(int a: arrayofAadhar){
            System.out.println(a);
        }

        arrayofAadhar = new int[6];
        arrayofAadhar[0] = 10001;
        arrayofAadhar[1] = 10002;
        arrayofAadhar[2] = 10003;
        arrayofAadhar[3] = 10004;
        arrayofAadhar[4] = 10005;
        arrayofAadhar[5] = 10006;

        int[] arrayOfAadhar1 = null;
        System.out.println("----------------------");
        int found = 0;
        for (int a: arrayofAadhar){
            System.out.println(a);
        }

        for(int i =0; i < arrayofAadhar.length; i++){
            if (arrayofAadhar[i] == 1000){
                found++;
            }
        }
        if (found == 0){
            System.out.println("Not found");
        } else {
            arrayOfAadhar1 = new int[arrayofAadhar.length - found];
            for(int i = 0; i<arrayOfAadhar1.length; i++){
                for (int j=1; j<arrayofAadhar.length; j++){
                    if (arrayofAadhar[j]!=10003){
                        arrayOfAadhar1[i] = arrayofAadhar[j];
                        break;
                    }
                }
            }
        }

    }
}
