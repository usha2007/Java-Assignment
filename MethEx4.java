package io.github.jiangdequan;

public class MethEx4 {
    
        // Method with one integer parameter
        static void display(int a) {
            System.out.println("Display method with an integer: " + a);
        }
    
        // Method with one string parameter
        static void display(String a) {
            System.out.println("Display method with a string: " + a);
        }
    
        public static void main(String[] args) {
            // Calling both overloaded methods from the main method
            display(10);         // Calls the method with an integer parameter
            display("Hello!");   // Calls the method with a string parameter
        }
    }