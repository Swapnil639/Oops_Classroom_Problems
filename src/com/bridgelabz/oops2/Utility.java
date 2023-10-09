package com.bridgelabz.oops2;

import java.util.Scanner;

public class Utility {
    public static Scanner scanner=new Scanner(System.in);
    public static int scannerInt(){
        int a= scanner.nextInt();
        return a;
    }
    public static String scannerString(){
        String str= scanner.next();
        return str;
    }
    public static double scannerDouble(){
        double d= scanner.nextDouble();
        return d;
    }
    public static byte scannerByte(){
        byte b= scanner.nextByte();
        return b;
    }
}
