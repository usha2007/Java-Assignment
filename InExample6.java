package io.github.jiangdequan;

public class InExample6 {
    public static void main(String[] args) {
        
        // Base class A
        class A {
            int data = 10;

            int getData() {
                return data;
            }
        }

        // Derived class B
        class B extends A {
            int data = 20;

            @Override
            int getData() {
                return data;
            }
        }

        // Derived class C
        class C extends B {
            int data = 30;

            @Override
            int getData() {
                return data;
            }
        }

        // Reference of A pointing to objects of B and C
        A aRefB = new B();  
        A aRefC = new C();  

        // Accessing data using the method
        System.out.println("aRefB.getData(): " + aRefB.getData());  
        System.out.println("aRefC.getData(): " + aRefC.getData());  
    }
}