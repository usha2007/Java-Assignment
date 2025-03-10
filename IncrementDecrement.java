package io.github.jiangdequan;

public class IncrementDecrement {

    // Method to increment a number
    public static int increment(int num) {
        return num + 1;
    }

    // Method to decrement a number
    public static int decrement(int num) {
        return num - 1;
    }

    public static void main(String[] args) {
        int num = 10;

        // Increment the number
        num = increment(num);
        System.out.println("After increment: " + num);  // Output: 11

        // Decrement the number
        num = decrement(num);
        System.out.println("After decrement: " + num);  // Output: 10
    }
}
