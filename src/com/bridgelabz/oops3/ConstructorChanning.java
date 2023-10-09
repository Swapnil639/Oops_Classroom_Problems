package com.bridgelabz.oops3;

public class ConstructorChanning {
    private int x;
    private int y;

    public ConstructorChanning() {
        System.out.println("No argument constructor");
    }

    public ConstructorChanning(int x) {
        this();
        System.out.println("One argument constructor");
    }

    public ConstructorChanning(int x, int y) {
        this(20);
        System.out.println("Two argument constructor");
    }

    public static void main(String[] args) {
        ConstructorChanning obj=new ConstructorChanning(10,11);
    }
}
