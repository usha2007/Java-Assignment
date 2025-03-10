package io.github.jiangdequan;

public class Example4 {
    
        public static void staticMethod() {
            
            Example4 example = new Example4();
            example.instanceMethod();
        }
    
        
        public void instanceMethod() {
            System.out.println("Instance Method Called");
        }
    
        public static void main(String[] args) {
            staticMethod();
        }
    }