package io.github.jiangdequan;

public class InExample3 {
        public static void main(String[] args) {
            
        
            class A {
                
                void methodA1() {
                    System.out.println("Class A: Method 1");
                
                }
                
                
                void overriddenMethod() {
                    System.out.println("Class A: Overridden Method");
                }
            }
            
            
            class B extends A {
                
                void methodB1() {
                    System.out.println("Class B: Method 1");
                }
    
            
                @Override
                void overriddenMethod() {
                    System.out.println("Class B: Overridden Method");
                }
            }
            
        
            class C extends B {
                
                void methodC1() {
                    System.out.println("Class C: Method 1");
                }
                
            
                @Override
                void overriddenMethod() {
                    System.out.println("Class C: Overridden Method");
                }
            }
    
            
            C c = new C();
            
        
            c.methodA1();        
            c.methodB1();        
                   
            c.methodC1();        
                
            c.overriddenMethod(); 
        }
}