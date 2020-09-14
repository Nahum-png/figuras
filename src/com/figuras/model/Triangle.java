package com.figuras.model;

public class Triangle {
    private int base;
    private int height;
    private double AreaT;

    public Triangle(int base, int height) {       //Constructor
        this.base = base;
        this.height = height;
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

    public void setAreaT(double areaT) {
        AreaT = areaT;
    }

    public double getArea() {
        return AreaT;
    }

    public void draw() {
        System.out.println("Triangulo");
    }
}
