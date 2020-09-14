package com.figuras;

import com.figuras.model.Circle;
import com.figuras.model.Rectangle;
import com.figuras.model.Square;
import com.figuras.model.Triangle;

public class Application {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5), circle2 = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 20);                //Se crearon e inicializan las figuras
        Square squares[] = new Square[5];
        Triangle triangle = new Triangle(10, 20);

        squares[0]=new Square(19);
        squares[1]=new Square(52);
        squares[2]=new Square(44);
        squares[3]=new Square(20);
        squares[4]=new Square(14);

        double AreaX;     //Variable auxiliar para calcular areas de las figuras

        AreaX=(Math.PI)*(Math.pow(circle1.getRadio(),2));      //area circulo 1
        circle1.setAreaC(AreaX);

        AreaX=(Math.PI)*(Math.pow(circle2.getRadio(),2));       //area circulo 2
        circle2.setAreaC(AreaX);

        for(int i=0; i<5; i++){                           //area de los cuadrados
            AreaX=(Math.pow(squares[i].getSide(),2));
            squares[i].setAreaS(AreaX);
        }

        AreaX=(rectangle.getBase())*(rectangle.getHeight());     //area del rectangulo
        rectangle.setAreaR(AreaX);

        AreaX=((triangle.getBase())* triangle.getHeight())/2;   //area del triangulo
        triangle.setAreaT(AreaX);

        printFigure(circle1);
        printFigure(circle2);
        printFigure(rectangle);
        for (Square square : squares) {
            printFigure(square);
        }
        printFigure(triangle);

    }

    public static void printFigure(Circle circle) {
        circle.draw();
        System.out.println("Area: " + circle.getArea());
    }

    public static void printFigure(Rectangle rectangle) {
        rectangle.draw();
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void printFigure(Square square) {
        square.draw();
        System.out.println("Area: " + square.getArea());
    }

    public static void printFigure(Triangle triangle) {
        triangle.draw();
        System.out.println("Area: " + triangle.getArea());
    }


}
