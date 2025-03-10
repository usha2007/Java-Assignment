package io.github.jiangdequan;

public class TSEx6 {
        public static void main(String[] args) {
            // Parent class inside main method
            class Parent {
                void display() {
                    System.out.println("Parent class display method");
                }
                
                void parentMethod() {
                    System.out.println("Parent class method");
                }
            }
    
            // Child class inside main method
            class Child extends Parent {
                void display() {
                    // Calling the Parent class's display method using super()
                    super.display();
                    System.out.println("Child class display method");
                }
    
                void childMethod() {
                    System.out.println("Child class method");
                    this.display();  // Calling Child's own display method using 'this'
                }
    
                void callParentMethod() {
                    // Calling the Parent class's method using super()
                    super.parentMethod();
                }
            }
    
            // Create an instance of Child class inside main method
            Child childObj = new Child();
    
            // Calling childMethod which calls display() using this
            childObj.childMethod();
    
            // Calling callParentMethod which calls parentMethod() using super
            childObj.callParentMethod();
        }
    }