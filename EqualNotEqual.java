package io.github.jiangdequan;

public class EqualNotEqual {
    public class Main {
        public static void main(String[] args) {
            // Example variables
            int a = 10;
            int b = 20;
            int c = 10;
    
            // Using '==' (equal) operator
            if (a == c) {
                System.out.println(a + " is equal to " + c);
            } else {
                System.out.println(a + " is not equal to " + c);
            }
    
            // Using '!=' (not equal) operator
            if (a != b) {
                System.out.println(a + " is not equal to " + b);
            } else {
                System.out.println(a + " is equal to " + b);
            }
        }
    }
    
}