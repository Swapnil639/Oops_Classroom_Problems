package com.bridgelabz.oops3;

class Outer{
    static int outerData=10;
    int instanceData=20;
    static class inner{
        void show(){
            System.out.println("Outer data:"+outerData);
        }
    }
}
public class OuterMain {
    public static void main(String[] args) {
        Outer.inner obj=new Outer.inner();
        obj.show();
    }
}
