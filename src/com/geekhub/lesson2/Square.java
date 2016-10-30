package com.geekhub.lesson2;


public class Square extends Shape {

    @Override
    public double calculateArea(double sideA, double sideB, String name_shape) {
        double areaRect = sideA * sideB;
        double areaTriangCont = areaRect/2;
        System.out.println("Area of " +  name_shape + " is: "+ areaRect);
        System.out.println("Area of triangle which contained " + name_shape + ": " + areaTriangCont);
        return areaRect;
    }

    @Override
    public double calculatePerimeter(double sideA, double sideB, String name_shape) {
        double perimRect = (sideA + sideB) * 2;
        double a = Math.sqrt(sideA);
        double b = Math.sqrt(sideB);
        double diag = a + b;
        double perimTriangCont = (perimRect/2)+ diag;
        System.out.println("Perimeter of " + name_shape + ": " + perimRect);
        System.out.println("Perimetr of triangle which contained " + name_shape + ": " + perimTriangCont);
        return perimRect;
    }
}

