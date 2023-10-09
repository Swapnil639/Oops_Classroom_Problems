package com.bridgelabz.oops2;

public class Calculator {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.input();
    }

    public int modulus(int a, int b) {
        int c = a % b;
        return c;
    }

    public int divide(int a, int b) {
        int c = a / b;
        return c;
    }

    public int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    public int subtract(int a, int b) {
        int c = a - b;
        return c;
    }

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public void input() {
        System.out.println("Enter two number:");
        int x = Utility.scannerInt();
        int y=Utility.scannerInt();

        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Modulus");
        int n = Utility.scannerInt();
        switch (n) {
            case 1:
                System.out.println("Output:" + add(x, y));
                break;
            case 2:
                System.out.println("Output:" + subtract(x, y));
                break;
            case 3:
                System.out.println("Output:" + multiply(x, y));
                break;
            case 4:
                System.out.println("Output:" + divide(x, y));
                break;
            case 5:
                System.out.println("Output:" + modulus(x, y));
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
