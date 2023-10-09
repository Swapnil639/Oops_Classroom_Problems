package com.bridgelabz.oops2;


public class Cuboid {
    double length;
    double breadth;
    double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 4 * (length + breadth + height);
    }

    public double calculateArea() {
        return 2 * ((length * breadth) + (breadth * height) + (height * length));
    }

    public double calculateVolume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        double length=Utility.scannerDouble();
        double breadth=Utility.scannerDouble();
        double height=Utility.scannerDouble();

        Cuboid obj=new Cuboid(length,breadth,height);
        System.out.println("Volume of the cuboid: " + obj.calculateVolume());
        System.out.println("Area of the cuboid: " + obj.calculateArea());
        System.out.println("Perimeter of the cuboid: " + obj.calculatePerimeter());
    }
}
