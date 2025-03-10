package io.github.jiangdequan;

import java.util.Scanner; // Correctly placed import statement

public class LargeNumber {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Find the largest number using conditional statements
        int largest = num1; // Assume num1 is the largest
        
        if (num2 > largest) {
            largest = num2; // Update if num2 is greater
        }
        
        if (num3 > largest) {
            largest = num3; // Update if num3 is greater
        }
        
        // Print the largest number
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
