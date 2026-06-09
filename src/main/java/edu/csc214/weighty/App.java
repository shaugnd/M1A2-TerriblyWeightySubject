package edu.csc214.weighty;

import java.util.Scanner;

/**
 * Runs the Terribly Weighty Subject application.
 *
 * <p>This class handles console input and output asking the user for a
 * whole-number ounce value, uses a {@link Converter} object to perform the
 * conversion, and displays the results.</p>
 * 
 */
public class App {
    /**
     * Starts the app.
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(String[] args) {
        // Setup
        Scanner input = new Scanner(System.in);
        Converter converter = new Converter();

        // Greet and Get
        System.out.println("Welcome to A Terribly Weighty Subject!");
        System.out.print("Enter a whole number of ounces: ");
        int ounces = input.nextInt();
        
        // Output.

        String ounceLabel = ounces == 1 ? "ounce" : "ounces";

        System.out.println("You entered " + ounces + " " + ounceLabel + ".");
        System.out.println(ounces + " " + ounceLabel + " is " + converter.toPoundsAndOunces(ounces) + ".");
        System.out.printf("%d %s is %.4f pounds.%n", ounces, ounceLabel, converter.toPounds(ounces));
        System.out.println("Goodbye!");
        
        input.close();
    }
}
