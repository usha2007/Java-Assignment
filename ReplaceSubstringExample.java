package io.github.jiangdequan;

public class ReplaceSubstringExample {
        public static void main(String[] args) {
            String sentence = "I enjoy learning Java programming.";
    
            // Replace "Java" with "Python"
            String updatedSentence = sentence.replace("Java", "Python");
    
            System.out.println("Original: " + sentence);
            System.out.println("Updated: " + updatedSentence);
        }
    }