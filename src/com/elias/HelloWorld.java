package com.elias;

import java.util.Scanner;

/**
 * @author Elias Khatoun
 * @date 06/06/2024
 * A java implementation of Hello World
 */

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        // Get input from User
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your greeting: ");
        String greeting = input.nextLine();

        // Display the greeting
        System.out.println(generateGreeting(greeting, name));
    }

    /**
     * Creates greeting using a custom greeting and name
     * @param greeting   What greeting to use
     * @param name       Who to greet
     * @return           The completed greeting
     */

    public static String generateGreeting(String greeting, String name) {
        return greeting + ", "+ name + "!";
    }
}
