package com.mainacad;

import com.mainacad.shapes.Circle;
import com.mainacad.shapes.Quadrilateral;
import com.mainacad.shapes.Shape;
import com.mainacad.shapes.Square;
import com.mainacad.shapes.Triangle;

public class ApplicationRunner {

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Triangle triangle = new Triangle(100, 2);
    Quadrilateral quadrilateral = new Quadrilateral(10, 10);
    Square square = new Square(10);

    Shape shapeWithMaxArea;

    if (circle.getArea() > triangle.getArea()) {
      shapeWithMaxArea = circle;
    } else {
      shapeWithMaxArea = triangle;
    }

    if (quadrilateral.getArea() > shapeWithMaxArea.getArea()) {
      shapeWithMaxArea = quadrilateral;
    }

    if (square.getArea() > shapeWithMaxArea.getArea()) {
      shapeWithMaxArea = square;
    }

    System.out.println("Area of the largest shape is: " + shapeWithMaxArea.getArea() + " and it "
        + "is a " + shapeWithMaxArea.getClass().getSimpleName());

    System.out.println("Circle area: " + circle.getArea());
    System.out.println("Triangle area: " + triangle.getArea());
    System.out.println("Quadrilateral area: " + quadrilateral.getArea());
    System.out.println("Square area: " + square.getArea());
  }
}
