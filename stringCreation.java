package io.github.jiangdequan;

public class stringCreation {
    public class StringCreationExamples {
        public static void main(String[] args) {
            
            // 1. Using String Literal
            String str1 = "Hello, World!";
            System.out.println("Using String Literal: " + str1);
            
            // 2. Using new Keyword (Using Constructor)
            String str2 = new String("Hello, World!");
            System.out.println("Using new Keyword: " + str2);
            
            // 3. Using StringBuilder
            StringBuilder str3 = new StringBuilder("Hello");
            str3.append(", World!");
            System.out.println("Using StringBuilder: " + str3);
            
            // 4. Using StringBuffer
            StringBuffer str4 = new StringBuffer("Hello");
            str4.append(", World!");
            System.out.println("Using StringBuffer: " + str4);
            
            // 5. Using char[] (Character Array)
            char[] charArray = {'H', 'e', 'l', 'l', 'o'};
            String str5 = new String(charArray);
            System.out.println("Using char[]: " + str5);
            
            // 6. Using String.format()
            String str6 = String.format("Hello, %s! Today is %s.", "Alice", "Monday");
            System.out.println("Using String.format(): " + str6);
            
            // 7. Using String.concat()
            String str7 = "Hello".concat(", World!");
            System.out.println("Using String.concat(): " + str7);
            
            // 8. Using String.join()
            String str8 = String.join(", ", "Hello", "World", "Java");
            System.out.println("Using String.join(): " + str8);
            
            // 9. Using String.valueOf()
            int number = 123;
            String str9 = String.valueOf(number);
            System.out.println("Using String.valueOf(): " + str9);
        }
    }
    
}