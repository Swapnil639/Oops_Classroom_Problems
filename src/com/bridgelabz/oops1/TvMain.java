package com.bridgelabz.oops1;

class Tv{
    private String brand;
    private double size;
    private double price;

    public Tv(String brand, double size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;

        if (size >= 40 && size < 50) {
            discount = 0.1; // 10% discount for TVs between 40 and 49 inches
        } else if (size >= 50) {
            discount = 0.15; // 15% discount for TVs 50 inches or larger
        }

        return price * discount;
    }

    public void printTVDetails() {
        double discountedPrice = price - calculateDiscount();
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Discounted Price: Rs." + discountedPrice);
    }
}
public class TvMain {
    public static void main(String[] args) {
        Tv tv1 = new Tv("Sony", 42, 40000.0);
        Tv tv2 = new Tv("Samsung", 55, 50000.0);

        System.out.println("TV 1 Details:");
        tv1.printTVDetails();

        System.out.println("\nTV 2 Details:");
        tv2.printTVDetails();
    }
}
