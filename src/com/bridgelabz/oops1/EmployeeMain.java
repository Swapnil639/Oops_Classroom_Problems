package com.bridgelabz.oops1;

class Employee {
        private String name;
        private double salary;
        private int ID;

    public Employee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public double calculateYearlySalary() {
        return salary * 12;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee("ABC",5000,1);
        e1.printEmployeeDetails();

        double yearlySalary=e1.calculateYearlySalary();
        System.out.println("Yearly Salary:"+yearlySalary);
    }
}
