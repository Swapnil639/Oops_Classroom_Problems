package com.bridgelabz.oops2;

public class ArithmeticSum {
    public static void main(String[] args) {
        System.out.println("Enter 4 value");
        int a = Utility.scannerInt(); //10
        int b = Utility.scannerInt(); //20
        int c = Utility.scannerInt(); //30
        int d = Utility.scannerInt(); //40

        ArithmeticSum obj = new ArithmeticSum();
        System.out.println("Sum of 2 Variable:");
        System.out.println(obj.sum(a, b)); //30
        System.out.println("Sum of 3 Variable:");
        System.out.println(obj.sum(a, b, c)); //60
        System.out.println("Sum of 4 Variable:");
        System.out.println(obj.sum(a, b, c, d)); //100
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
