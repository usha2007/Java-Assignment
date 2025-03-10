package io.github.jiangdequan;

public class InterfaceEx8 {
    public static void main(String[] args) {
        // Interface with fields and methods
        interface MyInterface {
            int value = 10;  // Final and static by default
            void display();
        }

        // Class implementing the interface
        class MyClass implements MyInterface {
            @Override
            public void display() {
                System.out.println("Value from interface: " + value);
            }
        }

        // Call the method
        MyClass obj = new MyClass();
        obj.display();
    }
}
