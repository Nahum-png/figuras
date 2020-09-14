package com.figuras.model;

public class Circle {
    private int radio;
    private double AreaC;

    public Circle(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setAreaC(double areaC) {
        AreaC = areaC;
    }

    public double getArea(){
        return AreaC;
    }

    public void draw(){
        System.out.println("Circulo");
    }

}
