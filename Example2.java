package io.github.jiangdequan;

public class Example2 {
    
        int instanceVar = 30;
    
        
        public static void staticMethod() {
        
            Example2 example = new Example2();
            System.out.println("Instance Variable: " + example.instanceVar);
        }
    
        public static void main(String[] args) {
            
            staticMethod();
        }
    }