package io.github.jiangdequan;

public class ConsEx2 {
        public static void main(String[] args) {
            // Superclass with constructors
            class Parent {
                public Parent() {
                    System.out.println("Parent class constructor called");
                }
    
                public Parent(int x) {
                    System.out.println("Parent class constructor with value: " + x);
                }
            }
    
            // Child class calling super constructor
            class Child extends Parent {
                public Child() {
                    super();  // Calls default constructor of Parent
                    System.out.println("Child class constructor called");
                }
    
                public Child(int x) {
                    super(x);  // Calls Parent constructor with argument
                    System.out.println("Child class constructor with value: " + x);
                }
            }
    
            new Child();            // Calls default constructor of Parent and Child
            new Child(10);          // Calls constructor with argument for Parent and Child
        }
    }  