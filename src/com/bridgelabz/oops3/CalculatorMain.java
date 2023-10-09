package com.bridgelabz.oops3;

import com.bridgelabz.oops2.Utility;

abstract class Calculator {
    abstract int add(int a, int b);

    abstract int subtract(int a, int b);

    abstract int multiply(int a, int b);

    abstract int divide(int a, int b);

     int modulus(int a, int b){
        return a%b;
    }
}

class BasicCalculator extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    @Override
    int divide(int a, int b) {
        return a / b;
    }


    public void input() {
        System.out.println("Enter two value:");
        int a = Utility.scannerInt();
        int b = Utility.scannerInt();
        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Modulus");
        int n = Utility.scannerInt();
        switch (n) {
            case 1:
                System.out.println(add(a,b));
                break;
            case 2:
                System.out.println(subtract(a,b));
                break;
            case 3:
                System.out.println(multiply(a,b));
                break;
            case 4:
                System.out.println(divide(a,b));
                break;
            case 5:
                System.out.println(modulus(a,b));
                break;
        }
    }

}

public class CalculatorMain {
    public static void main(String[] args) {
        BasicCalculator obj = new BasicCalculator();
        obj.input();
    }
}
