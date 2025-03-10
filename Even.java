package Loops;

public class Even {
    public class Main {
        public static void main(String[] args) {
            // Initialize the starting point
            int number = 10;
    
            // Use a while loop to print even numbers between 10 and 100
            System.out.println("Even numbers between 10 and 100:");
            while (number <= 100) {
                if (number % 2 == 0) {  // Check if the number is even
                    System.out.print(number + " ");
                }
                number++;  // Increment the number by 1
            }
        }
    }
    
}