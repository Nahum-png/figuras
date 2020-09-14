package com.figuras.model;

public class Square {
    private int side;
    private double AreaS;

    public Square(int side) {
        this.side = side;
    }     //Constructor

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void setAreaS(double areaS) {
        AreaS = areaS;
    }

    public double getArea() {
        return AreaS;
    }

    public void draw() {
        System.out.println("Cuadrado");
    }
}
