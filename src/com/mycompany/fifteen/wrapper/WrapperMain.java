package com.mycompany.fifteen.wrapper;

public class WrapperMain {
    public static void main(String[] args){
        Integer num = 10;
        Integer num2 = new Integer(12345);
        Double salary = 23454.34;
        Double salary2 = new Double("23454.43");
        Double salary21 = new Double(23454.22);
        Float f1 = 2345.6f;
        Float f2 = new Float(2345.6f);
        Long ln = 12234556L;
        Long ln2 = new Long(123456l);
        Character c = 'A';
        Character c1 = new Character('B');
        Boolean b = new Boolean(true);

        String roll = "1234";
        Integer j = Integer.parseInt(roll);
        j = Integer.valueOf(roll);
        Double d = Double.parseDouble(roll);
        System.out.println(j);
        System.out.println(d);

        int x = 57;
        Integer y = x;
        System.out.println(x);
        System.out.println(y);

        Double d1 = 23.45;
        double z = d1;
        System.out.println(d1);
        System.out.println(z);
    }
}
