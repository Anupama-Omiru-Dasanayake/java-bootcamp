package com.anupama.bootcamp.fundamentals.variables;

public class InstanceVariable {

    // Instance variable

    String name;
    int age;
    double salary;


    public static void main(String[] args){

        InstanceVariable person1 = new InstanceVariable();

        person1.name = "Anupama";
        person1.age = 19;
        person1.salary = 100000;

        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Salary: " + person1.salary);




        InstanceVariable person2 = new InstanceVariable();

        person2.name = "John";
        person2.age = 20;
        person2.salary = 150000;

        System.out.println();

        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Salary: " + person2.salary);

    }

}
