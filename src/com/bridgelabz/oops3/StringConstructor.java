package com.bridgelabz.oops3;
class Animal{
    String parentString;

    public Animal() {
        parentString="This is Animal Class";
    }
}
class Monkey extends Animal{
     String childString;
    public Monkey() {
        super();
        childString="This is Monkey Class";
    }
}
public class StringConstructor {
    public static void main(String[] args) {
       Monkey m1=new Monkey();
        System.out.println(m1.parentString);
        System.out.println(m1.childString);
    }
}
