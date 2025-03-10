package io.github.jiangdequan;

public class MethEx2 {
    
        // Method with one integer parameter
        static void display(int a) {
            System.out.println("Display method with one integer: " + a);
        }
    
        // Method with one string parameter
        static void display(String a) {
            System.out.println("Display method with one string: " + a);
        }
    
        // Method with two parameters (integer and string)
        static void display(int a, String b) {
            System.out.println("Display method with an integer and a string: " + a + " and " + b);
        }
    
        public static void main(String[] args) {
            // Calling overloaded methods from the main method
            display(10);            // Calls method with one integer parameter
            display("Hello");       // Calls method with one string parameter
            display(5, "World");    // Calls method with two parameters: integer and string
        }
    }