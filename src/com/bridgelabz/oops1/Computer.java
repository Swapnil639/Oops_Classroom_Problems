package com.bridgelabz.oops1;

public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }
    public double calculatePrice() {
        double basePrice = 50000.0;
        double processorPrice = 50.0 * getProcessorSpeedFactor();
        double ramPrice = 10.0 * ram;
        double storagePrice = 0.2 * storage;
        return basePrice + processorPrice + ramPrice + storagePrice;
    }

    public void printComputerDetails() {
        System.out.println("Computer Details:");
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: Rs." + calculatePrice());
    }
    private double getProcessorSpeedFactor() {
        if (processor.equalsIgnoreCase("i5")) {
            return 1.2;
        } else if (processor.equalsIgnoreCase("i7")) {
            return 1.5;
        } else if (processor.equalsIgnoreCase("i9")) {
            return 2.0;
        } else {
            return 1.0; // Default factor for other processors
        }
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("i7", 16, 512);
        myComputer.printComputerDetails();
    }

}
