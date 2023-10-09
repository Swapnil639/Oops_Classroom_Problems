package com.bridgelabz.oops1;

public class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public void printDogDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " lbs");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador Retriever", 3, 65.5);
        dog1.printDogDetails();

        int dog1HumanAge = dog1.calculateDogAgeInHumanYears();
        System.out.println("Dog's age in human years: " + dog1HumanAge);
    }

    public int calculateDogAgeInHumanYears() {
        int humanAge = 0;

        if (age == 1) {
            humanAge = 15;
        } else if (age == 2) {
            humanAge = 9;
        } else {
            humanAge = 5;
        }

        return humanAge;
    }
}
