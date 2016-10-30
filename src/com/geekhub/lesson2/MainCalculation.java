package com.geekhub.lesson2;

import java.util.Scanner;

public class MainCalculation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your shape! ");
        System.out.println("For example: ");
        enumShapes[] allShapes = enumShapes.values();
        for (enumShapes shp : allShapes) {
            System.out.println(shp);
        }

        String name_shape = scanner.next();
        if (name_shape.equals("Circle") || name_shape.equals("circle")
                || name_shape.equals("Square") || name_shape.equals("square")
                || name_shape.equals("Rectangle") || name_shape.equals("rectangle")
                || name_shape.equals("Triangle") || name_shape.equals("triangle")) {
            System.out.println("Enter the parameters of " + name_shape + "!");
        } else
            System.out.println("Error!");

        if (name_shape.equals("Circle") || name_shape.equals("circle")) {
            System.out.println("Enter the radius of " + name_shape + "! ");
            double radius = scanner.nextDouble();
            Circle circleClass = new Circle();
            circleClass.calculateAreaCircle(radius, name_shape);
            circleClass.calculateCircumference(radius, name_shape);
        }

        if (name_shape.equals("Square") || name_shape.equals("square")
                || name_shape.equals("Rectangle") || name_shape.equals("rectangle")) {
            System.out.println("Enter the length of " + name_shape + ": ");
            double sideA = scanner.nextDouble();
            System.out.println("Enter the width of " + name_shape + ": ");
            double sideB = scanner.nextDouble();
            Square square = new Square();
            square.calculateArea(sideA, sideB, name_shape);
            square.calculatePerimeter(sideA, sideB, name_shape);
        }

        if (name_shape.equals("Triangle") || name_shape.equals("triangle")) {
            System.out.println("Enter side A of " + name_shape + "!");
            double sideA = scanner.nextDouble();
            System.out.println("Enter side B of " + name_shape + "!");
            double sideB = scanner.nextDouble();
            System.out.println("Enter side C of " + name_shape + "!");
            double sideC = scanner.nextDouble();
            Triangle triangle = new Triangle();
            triangle.calculateAreaTriangle(sideA,sideB,sideC,name_shape);
            triangle.calculatePerimeterTriangle(sideA,sideB,sideC,name_shape);
        }
    }
    public   enum  enumShapes {Circle, Square, Rectangle, Triangle}

}

