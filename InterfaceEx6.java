package io.github.jiangdequan;

public class InterfaceEx6 {
        public static void main(String[] args) {
            // Interface with default method
            interface MyInterface {
                default void display() {
                    System.out.println("Default method from interface is called.");
                }
            }
    
            // Class implementing the interface
            class MyClass implements MyInterface {}
    
            // Call the default method
            MyClass obj = new MyClass();
            obj.display();  // Call the default method
        }
    }