package com.bridgelabz.oops2;


public class Shape {
    double length;
    double breadth;

    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Shape createShape(double length, double breadth) {
        return new Shape(length, breadth);
    }

    double calculateTriangleArea() {
        return 0.5 * length * breadth;
    }

    double calculateRectangleArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Enter length value:");
        double length1 = Utility.scannerDouble();
        System.out.println("Enter breadth value:");
        double breadth1 = Utility.scannerDouble();

        Shape shape1 = createShape(length1, breadth1);

        double triangleArea1 = shape1.calculateTriangleArea();
        double rectangleArea1 = shape1.calculateRectangleArea();
        System.out.println("Area of triangle 1:" + triangleArea1);
        System.out.println("Area of rectangle 1:" + rectangleArea1);

        System.out.println("Enter length value:");
        double length2 = Utility.scannerDouble();
        System.out.println("Enter breadth value:");
        double breadth2 = Utility.scannerDouble();

        Shape shape2 = createShape(length2, breadth2);

        double triangleArea2 = shape2.calculateTriangleArea();
        double rectangleArea2 = shape2.calculateRectangleArea();
        System.out.println("Area of triangle 2:" + triangleArea2);
        System.out.println("Area of rectangle 2:" + rectangleArea2);


    }
}
