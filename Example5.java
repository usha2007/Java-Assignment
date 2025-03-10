package io.github.jiangdequan;

public class Example5 {

        public static void staticMethod() {
            System.out.println("Static Method Called");
        }
    
        
        public void instanceMethod() {
            staticMethod();  
        }
    
        public static void main(String[] args) {
            Example5 example = new Example5();
            example.instanceMethod();
        }
    }