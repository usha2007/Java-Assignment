package  io.github.jiangdequan;

public class SubstringExample {
        public static void main(String[] args) {
            // Define a string
            String str = "Hello, World!";
    
            // Extract substring starting from index 7
            String substring1 = str.substring(7);
            System.out.println("Substring from index 7: " + substring1);
    
            // Extract substring from index 0 to 5 (not inclusive of 5)
            String substring2 = str.substring(0, 5);
            System.out.println("Substring from index 0 to 5: " + substring2);
        }
    }