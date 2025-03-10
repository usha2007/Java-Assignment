package io.github.jiangdequan;

public class InExample2 {
        public static void main(String[] args) {
        
            class A {
                void displayA() {
                    System.out.println("Class A");
                }
            }
            
            
            class B extends A {
                void displayB() {
                    System.out.println("Class B");
                }
            }
            
            
            class C extends B {
                void displayC() {
                    System.out.println("Class C");
                }
            }
    
            
            C c = new C();
            
            
            c.displayA();  
            c.displayB();  
            c.displayC();  
        }
    }