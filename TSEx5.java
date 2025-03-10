package io.github.jiangdequan;

public class TSEx5 {
        public static void main(String[] args) {
            // Define the Parent class inside the main method
            class Parent {
                int a;
    
                // Parent class constructor with one parameter
                Parent(int x) {
                    a = x;
                    System.out.println("Parent class constructor called with value: " + a);
                }
            }
    
            // Define the Child class inside the main method
            class Child extends Parent {
                int b;
    
                // Child class constructor
                Child(int x, int y) {
                    super(x);  // Call the parent class constructor with one parameter
                    b = y;
                    System.out.println("Child class constructor called with value: " + b);
                }
    
                void display() {
                    System.out.println("Parent value a: " + a + ", Child value b: " + b);
                }
            }
    
            // Create an object of the Parent class
            Parent parentObj = new Parent(10);  // Calls the constructor of the Parent class
    
            // Create an object of the Child class
            Child childObj = new Child(20, 30);  // Calls the constructor of the Child class which uses super()
    
            // Display values from both Parent and Child classes
            childObj.display();  // This method prints values from both Parent and Child
        }
    }