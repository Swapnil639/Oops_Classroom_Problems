package com.bridgelabz.oops1;

interface Discountable{
    double calculateDiscount();
}
class Furniture implements Discountable{
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public double calculateDiscount(){
        double discount = 0.0;
        if (material.equalsIgnoreCase("wood")) {
            discount = 0.1 * price;
        } else if (material.equalsIgnoreCase("metal")) {
            discount = 0.2 * price;
        } else if (material.equalsIgnoreCase("plastic")) {
            discount = 0.05 * price;
        }
        return discount;
    }

    public void printFurnitureDetails() {
        double discountedPrice = price - calculateDiscount();
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Discounted Price: Rs." + discountedPrice);
    }
}
public class FurnitureMain {
    public static void main(String[] args) {
        Furniture table = new Furniture("Table", "Wood", 10000.0);
        Furniture chair = new Furniture("Chair", "Metal", 2050.0);
        Furniture lamp = new Furniture("Lamp", "Plastic", 1050.0);

        System.out.println("Table Details:");
        table.printFurnitureDetails();

        System.out.println("Chair Details:");
        chair.printFurnitureDetails();

        System.out.println("Lamp Details:");
        lamp.printFurnitureDetails();
    }
}
