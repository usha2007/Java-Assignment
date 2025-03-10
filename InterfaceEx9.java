package io.github.jiangdequan;

public class InterfaceEx9 {
        public static void main(String[] args) {
            // Default access interface
            interface MyInterface {
                int value = 100;
                void display();
            }
    
            // Class implementing the interface
            class MyClass implements MyInterface {
                public void display() {
                    System.out.println("Value from default interface: " + value);
                }
            }
    
            // Call the method
            MyClass obj = new MyClass();
            obj.display();
        }
    }