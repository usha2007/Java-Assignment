package io.github.jiangdequan;

public class IndexOfExample {
        public static void main(String[] args) {
            // Define a string
            String str = "Hello, World!";
    
            // Searching for the index of the character 'W'
            int indexChar = str.indexOf('W');
            System.out.println("The index of 'W': " + indexChar);
    
            // Searching for the index of the substring "World"
            int indexSubstring = str.indexOf("World");
            System.out.println("The index of 'World': " + indexSubstring);
    
            // Searching for a character starting from index 5
            int indexCharFrom = str.indexOf('o', 5);
            System.out.println("The index of 'o' starting from index 5: " + indexCharFrom);
    
            // Searching for a substring starting from index 5
            int indexSubstringFrom = str.indexOf("World", 5);
            System.out.println("The index of 'World' starting from index 5: " + indexSubstringFrom);
    
            // If the character/substring is not found, indexOf() will return -1
            int indexNotFound = str.indexOf("Java");
            System.out.println("The index of 'Java' (not found): " + indexNotFound);
        }
    }