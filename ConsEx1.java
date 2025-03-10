package io.github.jiangdequan;

public class ConsEx1 {
    public static void main(String[] args) {
        // Local class defined inside the main method
        class MyClass {
            // Default constructor
            public MyClass() {
                System.out.println("Default constructor called");
            }

            // Constructor with one parameter
            public MyClass(int num) {
                System.out.println("One-argument constructor called with value: " + num);
            }

            // Constructor with two parameters
            public MyClass(int num1, int num2) {
                System.out.println("Two-argument constructor called with values: " + num1 + " and " + num2);
            }
        }

        // Calling all constructors
        new MyClass();             // Default constructor
        new MyClass(5);            // One-argument constructor
        new MyClass(10, 20);       // Two-argument constructor
    }
}
