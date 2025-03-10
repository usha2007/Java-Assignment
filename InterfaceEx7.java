package io.github.jiangdequan;

public class InterfaceEx7 {
    public static void main(String[] args) {
        // Parent Interface
        interface ParentInterface {
            void methodOne();
        }

        // Child Interface inheriting ParentInterface
        interface ChildInterface extends ParentInterface {
            void methodTwo();
        }

        // Class implementing both methods
        class MyClass implements ChildInterface {
            @Override
            public void methodOne() {
                System.out.println("Method One from ParentInterface is called.");
            }

            @Override
            public void methodTwo() {
                System.out.println("Method Two from ChildInterface is called.");
            }
        }

        // Call the methods
        MyClass obj = new MyClass();
        obj.methodOne();
        obj.methodTwo();
    }
}
