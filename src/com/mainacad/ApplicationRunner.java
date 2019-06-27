package com.mainacad;

import com.mainacad.shape.Circle;
import com.mainacad.shape.Quadrilateral;
import com.mainacad.shape.Square;
import com.mainacad.shape.Triangle;

public class ApplicationRunner {

//    // Primitives

//    // Numbers
//    byte myByte; // от -128 до 127
//    short myShort; // от -32768 до 32767
//    int myInt; // от -2147483648 до 2147483647
//    long myLong; // от -9223372036854775808 до 9223372036854775807

//    // Decimals
//    float myFloat; // ~ от -3.4·1038 до 3.4·1038
//    double myDouble; // ~ от  -1.8·10308 до 1.8·10308

//    // Symbols ASCII
//    char myChar;

//    // Boolean
//    boolean myBoolean;


  public static void main(String[] args) {

    Circle circle1 = new Circle();
    circle1.setRadius(17.34);
    System.out.println("Circle radius is: " + circle1.getRadius());

    Quadrilateral quadrilateral = new Quadrilateral(12, 18);
    quadrilateral.setSide(12);
    quadrilateral.setBase(14);

    Square square = new Square(17);
    square.setSide(12);

    Triangle triangle = new Triangle(18, 19);
    triangle.setBase(12);
    triangle.setHeight(15);

    Triangle triangle1 = new Triangle(12, 18);
  }
}
