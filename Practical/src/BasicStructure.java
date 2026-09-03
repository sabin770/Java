// 1. Package declaration (optional)
package com.example;

// 2. Import statements (optional)
import java.util.Scanner;

// 3. Class declaration
public class BasicStructure {

    // 4. Variables (fields)
    private String name;
    private int age;

    // 5. Constructor (optional)
    public BasicStructure(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 6. Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // 7. Main method (entry point)
    public static void main(String[] args) {
        System.out.println("Java Program Structure");

        // Creating object
        BasicStructure obj = new BasicStructure("Sabin", 19);
        obj.display();
    }
}