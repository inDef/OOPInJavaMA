package com.mainacad.shape;

public class Square extends AbstractShape {
    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }
}
