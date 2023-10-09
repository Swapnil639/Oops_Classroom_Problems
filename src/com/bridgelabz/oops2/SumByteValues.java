package com.bridgelabz.oops2;


public class SumByteValues {
    void sumByteValue(byte byte1,byte byte2){
        int sum = (int) byte1 + (int) byte2;

        System.out.println("Sum of byte values: " + sum); //30
    }
    public static void main(String[] args) {
        System.out.println("Enter two byte value");
        byte byte1 = Utility.scannerByte(); //10
        byte byte2 = Utility.scannerByte(); //20

        SumByteValues obj=new SumByteValues();
        obj.sumByteValue(byte1,byte2);
    }
}
