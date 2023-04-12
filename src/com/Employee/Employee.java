package com.Employee;

public class Employee {
    String name;
    int age;
    int salary;

    public void empInfo(String name) {
        this.name = name;
        System.out.println("Name of Employee : " + name);
    }

    public void empInfo(int age) {
        this.age = age;
        System.out.println("Age of the employee : " + age);
    }

    public void empInfo(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("Name of  employee : " + name + " \t Age of the Employee : " + age + " \t salary of the Employee : " + salary);
    }
}

