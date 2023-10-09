package com.bridgelabz.oops2;

public class ObjectCounter {
    static int counter=0;
    public ObjectCounter() {
        counter++;
    }
    static int getNumberOfObject(){
        return counter;
    }

    public static void main(String[] args) {
        ObjectCounter obj1=new ObjectCounter();
        ObjectCounter obj2=new ObjectCounter();
        ObjectCounter obj3=new ObjectCounter();
        System.out.println("Number of Objects created:"+ObjectCounter.getNumberOfObject());
    }
}
