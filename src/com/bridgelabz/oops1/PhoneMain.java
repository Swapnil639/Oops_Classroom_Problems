package com.bridgelabz.oops1;

abstract class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public abstract double calculatePrice();

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
    }
}

class AndroidPhone extends Phone {
    private double basePrice;

    public AndroidPhone(String make, String model, int storage, double basePrice) {
        super(make, model, storage);
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() {
        double price = basePrice + (0.1 * getStorage());
        return price;
    }
}

class IPhone extends Phone {
    private double basePrice;

    public IPhone(String make, String model, int storage, double basePrice) {
        super(make, model, storage);
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() {
        double price = basePrice + (0.15 * getStorage());
        return price;
    }
}

public class PhoneMain {
    public static void main(String[] args) {
        AndroidPhone androidPhone = new AndroidPhone("Samsung", "Galaxy S21", 128, 50000);
        IPhone iPhone = new IPhone("Apple", "iPhone 13", 256, 90000);

        System.out.println("Details of Android Phone:");
        androidPhone.printDetails();
        System.out.println("Price: Rs." + androidPhone.calculatePrice());

        System.out.println("Details of iPhone:");
        iPhone.printDetails();
        System.out.println("Price: Rs." + iPhone.calculatePrice());
    }
}