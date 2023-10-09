package com.bridgelabz.oops2;


public class MethodOverloading {
    double area(int length,int breadth){
        return 0.5*length*breadth;
    }
    double area(double length,double breadth){
        return length*breadth;
    }
    double area(double length){
        return Math.PI*length*length;
    }
    public static void main(String[] args) {
        double length=Utility.scannerDouble();
        double breadth=Utility.scannerDouble();
        int length1=Utility.scannerInt();
        int breadth1=Utility.scannerInt();

        MethodOverloading obj=new MethodOverloading();
        System.out.println("Area of square:"+obj.area(length,breadth));
        System.out.println("Area of rectangle:"+obj.area(length1,breadth1));
        System.out.println("Area of a circle:"+obj.area(length));

    }
}
