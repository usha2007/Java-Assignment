package io.github.jiangdequan;

public class ConsEx3 {
    public static void main(String[] args) {
        // Class with different access modifiers for constructors
        class MyClass {
            private MyClass() {
                System.out.println("Private constructor called");
            }

            public MyClass(int x) {
                System.out.println("Public constructor called with value: " + x);
            }

            protected MyClass(int x, int y) {
                System.out.println("Protected constructor called with values: " + x + " and " + y);
            }

            MyClass(String msg) {
                System.out.println("Default constructor called with message: " + msg);
            }

            // Static factory method to demonstrate the private constructor
            public static MyClass createUsingPrivateConstructor() {
                return new MyClass();
            }
        }

        // Calling constructors
        MyClass.createUsingPrivateConstructor(); // Access the private constructor via factory method
        new MyClass(5);                          // Public constructor
        new MyClass(10, 20);                     // Protected constructor
        new MyClass("Hello");                    // Default constructor
    }
}
