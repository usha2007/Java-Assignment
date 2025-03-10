package io.github.jiangdequan;

public class StringEqualsExample {
        public static void main(String[] args) {
            // Define two strings
            String str1 = "Hello";
            String str2 = "Hello";
            String str3 = new String("Hello");
            String str4 = "hello";  // Note the lowercase 'h'
    
            // Using equals() to compare strings
            System.out.println("str1 equals str2: " + str1.equals(str2));  // true
            System.out.println("str1 equals str3: " + str1.equals(str3));  // true
            System.out.println("str1 equals str4: " + str1.equals(str4));  // false
        }
    }