package io.github.jiangdequan;

public class InterfaceEx5 {
        public static void main(String[] args) {
            // Interface 1 with method
            interface InterfaceOne {
                void display();
            }
    
            // Interface 2 with the same method
            interface InterfaceTwo {
                void display();
            }
    
            // Class implementing both interfaces
            class MyClass implements InterfaceOne, InterfaceTwo {
                public void display() {
                    System.out.println("Display method from both interfaces is called.");
                }
            }
    
            // Call the method
            MyClass obj = new MyClass();
            obj.display();  // Call the implemented method
        }
    }