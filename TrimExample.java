package io.github.jiangdequan;

public class TrimExample {
        public static void main(String[] args) {
            // Define strings with leading and trailing spaces
            String str1 = "   Hello World!   ";
            String str2 = "   Java Programming   ";
            String str3 = "NoSpacesHere";
    
            // Using trim() to remove leading and trailing spaces
            System.out.println("Before trim: '" + str1 + "'");
            System.out.println("After trim: '" + str1.trim() + "'");
    
            System.out.println("Before trim: '" + str2 + "'");
            System.out.println("After trim: '" + str2.trim() + "'");
    
            System.out.println("Before trim: '" + str3 + "'");
            System.out.println("After trim: '" + str3.trim() + "'");
        }
    }   