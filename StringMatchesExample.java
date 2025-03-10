package io.github.jiangdequan;

public class StringMatchesExample {
        public static void main(String[] args) {
            // Define a string
            String str1 = "Hello123";
            String str2 = "hello123";
            String str3 = "12345";
            String str4 = "Hello!";
    
            // Check if str1 contains only letters (upper and lowercase) and digits (0-9)
            System.out.println("str1 matches '^[A-Za-z0-9]+$' : " + str1.matches("^[A-Za-z0-9]+$"));
    
            // Check if str2 contains only digits (0-9)
            System.out.println("str2 matches '^[0-9]+$' : " + str2.matches("^[0-9]+$"));
    
            // Check if str3 contains only digits (0-9)
            System.out.println("str3 matches '^[0-9]+$' : " + str3.matches("^[0-9]+$"));
    
            // Check if str4 contains only alphabets (letters) and no special characters
            System.out.println("str4 matches '^[A-Za-z]+$' : " + str4.matches("^[A-Za-z]+$"));
    
            // Check if str1 contains only alphabets and starts with 'H'
            System.out.println("str1 matches '^[H][A-Za-z]+$' : " + str1.matches("^[H][A-Za-z]+$"));
        }
    }