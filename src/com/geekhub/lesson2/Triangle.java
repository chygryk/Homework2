package com.geekhub.lesson2;

public class Triangle extends Shape {

    @Override
    public double calculateAreaTriangle(double sideA, double sideB, double sideC, String name_shape) {

        double per = (sideA + sideB + sideC) / 2;
        double areaTriangl = (per * (per - sideA) * (per - sideB) * (per - sideC));
        System.out.println("Area of " +  name_shape + " is: "+ areaTriangl);
        return areaTriangl;
    }

    @Override
    public double calculatePerimeterTriangle(double sideA, double sideB, double sideC, String name_shape) {
        double perimTriangl = sideA+sideB+sideC;
        System.out.println("Perimetr of " +  name_shape + " is: "+ perimTriangl);
        return perimTriangl;
    }
}
