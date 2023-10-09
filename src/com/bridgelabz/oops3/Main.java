package com.bridgelabz.oops3;

import com.bridgelabz.oops2.Utility;

interface Shape {
    double area();
}

class Circle implements Shape{
    private double radius= Utility.scannerDouble();

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

}
class Rectangle implements Shape{
    private double length=Utility.scannerDouble();
    private double width=Utility.scannerDouble();
    @Override
    public double area() {
        return 0.5*length*width;
    }
}
public class Main{
    public static void main(String[] args) {
        Shape obj1 =new Circle();
        System.out.println(obj1.area());
        Shape obj2=new Rectangle();
        System.out.println(obj2.area());
    }
}
