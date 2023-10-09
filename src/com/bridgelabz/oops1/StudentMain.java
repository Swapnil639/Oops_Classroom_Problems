package com.bridgelabz.oops1;

class Student {
    private String name;
    private int age;
    private int ID;

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s1=new Student("Swapnil",23,1);
        System.out.println(s1);
    }
}
