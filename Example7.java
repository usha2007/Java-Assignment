package io.github.jiangdequan;

public class Example7 {
        public static void staticMethod() {
            System.out.println("Static Method Called");
        }
    
        public void instanceMethod() {
            System.out.println("Instance Method Called");
        }
    
        public static void main(String[] args) {
            staticMethod();
    
            Example7 example = new Example7();
            example.instanceMethod();
        }
    }