package io.github.jiangdequan;

public class MethEx3 {
    
        // Method with one integer parameter
        static void display(int a) {
            System.out.println("Display method with one integer: " + a);
        }
    
        // Method with two integer parameters
        static void display(int a, int b) {
            System.out.println("Display method with two integers: " + a + " and " + b);
        }
    
        public static void main(String[] args) {
            // Calling both methods
            display(10);         // Calls method with one parameter
            display(10, 20);     // Calls method with two parameters
        }
    }