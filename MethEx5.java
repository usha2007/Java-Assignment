package io.github.jiangdequan;

public class MethEx5 {
    
        // Method with one integer parameter, returns an int
        static int display(int a) {
            System.out.println("Display method returning an int: " + a);
            return a;
        }
    
        // Method with one double parameter, returns a double
        static double display(double a) {
            System.out.println("Display method returning a double: " + a);
            return a;
        }
    
        public static void main(String[] args) {
            int intResult = display(10);     // Calls the method with int parameter
            double doubleResult = display(10.5);  // Calls the method with double parameter
    
            System.out.println("Returned integer value: " + intResult);
            System.out.println("Returned double value: " + doubleResult);
        }
    }