package com.anupama.bootcamp.fundamentals.variables;

public class LocalVariable {

    public static void main(String[] args){

        int age = 19;
        String name = "Anupama";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        calculate();

    }

    public static void calculate(){

        double numberOne = 10;
        double numberTwo = 20;

        System.out.println(numberOne + numberTwo);


    }


}
