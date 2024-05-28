package com.mycompany.eight.constructor;

public class ShapeMain {
    public static void main(String[] args){
        Shape s = new Shape();
        Shape s1 = new Shape(20, "Sqaure");
        Shape s2 = new Shape(20, "Rectangle", 13);

        Shape.InnerShape innerShape = s2.new InnerShape();
        innerShape.display();

    }
}
