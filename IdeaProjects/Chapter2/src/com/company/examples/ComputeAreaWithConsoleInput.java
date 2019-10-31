package com.company.examples;


import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // compute area
        double area = radius * radius * Math.PI;

        //Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
