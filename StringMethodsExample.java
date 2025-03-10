package io.github.jiangdequan;

public class StringMethodsExample {
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "hello";
            String str3 = "Hello, World!";
            String str4 = "Hello, Universe!";
    
            // equalsIgnoreCase()
            System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));  // true
    
            // startsWith()
            System.out.println("str3 starts with 'Hello': " + str3.startsWith("Hello"));  // true
            System.out.println("str3 starts with 'World': " + str3.startsWith("World"));  // false
    
            // endsWith()
            System.out.println("str3 ends with 'World!': " + str3.endsWith("World!"));  // true
            System.out.println("str3 ends with 'Universe!': " + str3.endsWith("Universe!"));  // false
    
            // compareTo()
            System.out.println("str1 compareTo str2: " + str1.compareTo(str2));  // negative (Hello < hello)
            System.out.println("str1 compareTo str4: " + str1.compareTo(str4));  // negative (Hello < Hello, Universe!)
            System.out.println("str4 compareTo str3: " + str4.compareTo(str3));  // positive (Hello, Universe! > Hello, World!)
        }
    }   