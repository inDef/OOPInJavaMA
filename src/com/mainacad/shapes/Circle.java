package com.mainacad.shapes;

public class Circle extends AbstractShape {

  private double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle() {
  }
}
