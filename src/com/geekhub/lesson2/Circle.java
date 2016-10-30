package com.geekhub.lesson2;


import static java.lang.Math.PI;

class Circle extends Shape {
    @Override
    public double calculateAreaCircle(double radius,String name_shape) {
        double area = PI * (radius * radius);
        System.out.println(name_shape + " area: " + area);
        return area;
    }

    @Override
    public double calculateCircumference(double radius, String name_shape) {
        double circumference = PI * 2 * radius;
        System.out.println("Length of perimeter " + name_shape + ": " + circumference);

        return circumference;
    }
}

