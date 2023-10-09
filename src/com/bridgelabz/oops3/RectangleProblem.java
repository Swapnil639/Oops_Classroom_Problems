package com.bridgelabz.oops3;

import com.bridgelabz.oops2.Utility;

public class RectangleProblem {
    public static void areaOfRectangle(int length,int breadth){
        int area=length*breadth;
        System.out.println(area);
    }
    public static void main(String[] args) {
        System.out.println("Enter length value:");
        int length= Utility.scannerInt();
        System.out.println("Enter breadth value:");
        int breadth=Utility.scannerInt();

        areaOfRectangle(length,breadth);
    }
}
