package com.mainacad.shape;

public class Quadrilateral extends Square {
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * super.getSide();
    }

    public Quadrilateral(double side, double base) {
        super(side);
        this.base = base;
    }

}
