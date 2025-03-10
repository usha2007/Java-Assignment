package io.github.jiangdequan;

public class MethEx1 {
    
        // Method with one parameter
        static void display(int a) {
            System.out.println("Display method with one integer: " + a);
        }
    
        // Method with two parameters
        static void display(int a, int b) {
            System.out.println("Display method with two integers: " + a + " and " + b);
        }
    
        public static void main(String[] args) {
            // Calling both overloaded methods from the main method
            display(10);         // Calls the method with one parameter
            display(10, 20);     // Calls the method with two parameters
        }
    }