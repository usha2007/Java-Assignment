package io.github.jiangdequan;

public class InterfaceEx4 {
    public static void main(String[] args) {
        // Interface 1
        interface InterfaceOne {
            void methodOne();
        }

        // Interface 2
        interface InterfaceTwo {
            void methodTwo();
        }

        // Class implementing both interfaces
        class MyClass implements InterfaceOne, InterfaceTwo {
            @Override
            public void methodOne() {
                System.out.println("Method One from InterfaceOne is called.");
            }

            @Override
            public void methodTwo() {
                System.out.println("Method Two from InterfaceTwo is called.");
            }
        }

        // Call the methods
        MyClass obj = new MyClass();
        obj.methodOne();
        obj.methodTwo();
    }
}
