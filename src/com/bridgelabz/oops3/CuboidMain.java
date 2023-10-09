package com.bridgelabz.oops3;

import com.bridgelabz.oops2.Utility;

class Cuboid {
    double length;
    double breadth;
    double height;


    public void input() {
        System.out.println("Enter length value:");
        length = Utility.scannerDouble();
        System.out.println("Enter breadth value:");
        breadth = Utility.scannerDouble();
        System.out.println("Enter height value:");
        height = Utility.scannerDouble();

        System.out.println("Volume of Cuboid:");
        double volume = length*breadth*height;
        System.out.println(volume);
    }
}

public class CuboidMain {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid();
        obj.input();

    }
}
