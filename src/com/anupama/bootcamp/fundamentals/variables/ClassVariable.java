package com.anupama.bootcamp.fundamentals.variables;



public class ClassVariable {

    // Class variable
    static String university = "University of Westminster";

    // Instance Variable
    String name;


    public static void main(String[] args){

        ClassVariable student1 = new ClassVariable();
        student1.name = "Anupama";

        ClassVariable student2 = new ClassVariable();
        student2.name = "Jon";


        System.out.println(student1.name);
        // Accessing static variable using class name
        System.out.println(ClassVariable.university);

        System.out.println();


        System.out.println(student2.name);
        System.out.println(ClassVariable.university);

        System.out.println();





    }
}
