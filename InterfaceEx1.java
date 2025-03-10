package io.github.jiangdequan;

public class InterfaceEx1 {
        public static void main(String[] args) {
            // Define the interface inside the main method
            interface MyInterface {
                void display();
            }
    
            // Implement the interface inside the main method
            class MyClass implements MyInterface {
                @Override
                public void display() {
                    System.out.println("Method from MyInterface is called.");
                }
            }
    
            // Create an instance of MyClass and call the display method
            MyClass obj = new MyClass();
            obj.display();  // Call the method implemented in MyClass
        }
    }