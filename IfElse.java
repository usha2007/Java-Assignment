package io.github.jiangdequan;

public class IfElse {
    public class Main {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            int num3 = 30;
    
            // Using if-else statements to find the largest number
            if (num1 >= num2 && num1 >= num3) {
                System.out.println(num1 + " is the largest number.");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
    }
    
    
}