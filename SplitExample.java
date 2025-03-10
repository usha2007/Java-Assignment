package io.github.jiangdequan;

public class SplitExample {
        public static void main(String[] args) {
            String sentence = "Java is a powerful programming language.";
    
            // Split the string by spaces
            String[] words = sentence.split(" ");  // Space as delimiter
    
            // Print the resulting array
            for (String word : words) {
                System.out.println(word);
            }
        }
    }