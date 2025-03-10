package io.github.jiangdequan;

public class InterfaceEx3 {
        public static void main(String[] args) {
            // Interface with one method
            interface MyInterface {
                void display();
            }
    
            // Class implementing the interface
            class MyClass implements MyInterface {
                public void display() {
                    System.out.println("Display method is called via interface.");
                }
            }
    
            // Interface reference to call the implemented method
            MyInterface obj = new MyClass();
            obj.display();  // Call the implemented method using interface reference
        }
    }