package com.bridgelabz.oops1;


class Shirt{
    private String size;
    private String color;
    private double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public double calculateDiscount() {
        double discount = 0.0;
        if (size.equals("S") || size.equals("M")) {
            discount = 0.05; // 5% discount for small and medium sizes
        } else if (size.equals("L") || size.equals("XL")) {
            discount = 0.1; // 10% discount for large and extra-large sizes
        }

        return price * discount;
    }

    public void printShirtDetails() {
        double discountedPrice = price - calculateDiscount();
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Discounted Price: Rs." + discountedPrice);
    }
}
public class ShirtMain {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("M", "Blue", 2500.0);
        Shirt shirt2 = new Shirt("XL", "Red", 3000.0);

        System.out.println("Shirt 1 Details:");
        shirt1.printShirtDetails();
        System.out.println();

        System.out.println("Shirt 2 Details:");
        shirt2.printShirtDetails();
    }
}
