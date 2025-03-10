package io.github.jiangdequan;

public class InterfaceEx11 {
        public static void main(String[] args) {
            // Interface with static final variable
            interface MyInterface {
                static final int CONSTANT_VALUE = 50;
                void display();
            }
    
            // Class implementing the interface
            class MyClass implements MyInterface {
                public void display() {
                    System.out.println("Static final variable value: " + CONSTANT_VALUE);
                }
            }
    
            // Call the method
            MyClass obj = new MyClass();
            obj.display();
        }
    }