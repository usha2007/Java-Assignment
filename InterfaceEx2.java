package io.github.jiangdequan;

public class InterfaceEx2 {
    public static void main(String[] args) {
        // Interface with two methods
        interface MyInterface {
            void methodOne();
            void methodTwo();
        }

        // Class implementing the interface
        class MyClass implements MyInterface {
            @Override
            public void methodOne() {
                System.out.println("Method One is called.");
            }

            @Override
            public void methodTwo() {
                System.out.println("Method Two is intentionally left empty.");
            }
        }

        // Call the implemented methods
        MyClass obj = new MyClass();
        obj.methodOne(); // Call the first method
        obj.methodTwo(); // Call the second method, even if it's empty
    }
}
