package io.github.jiangdequan;

public class Example6 {
        static int staticVar1 = 10;
    
    
        int instanceVar1 = 30;
    
        public static void main(String[] args) {
            
            System.out.println("Static Variable 1: " + staticVar1);
            
            Example6 example = new Example6();
            System.out.println("Instance Variable 1: " + example.instanceVar1);
        }
    }