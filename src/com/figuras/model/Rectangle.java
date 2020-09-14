package com.figuras.model;

public class Rectangle {
    private int base;
    private int height;
    private double AreaR;

    public Rectangle(int base, int height) {         //Constructor
        this.height = height;
        this.base = base;

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAreaR(double areaR) {
        AreaR = areaR;
    }

    public double getArea(){
        return AreaR;
    }

    public void draw(){
        System.out.println("Rectangulo");
    }
}
