package com.bridgelabz.oops1;

class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c1=new Circle(3);
        double area =c1.calculateArea();
        double circumference=c1.calculateCircumference();

        System.out.println("Circle with radius:"+c1.getRadius());
        System.out.println("Area:"+area);
        System.out.println("Circumference:"+circumference);
    }
}
