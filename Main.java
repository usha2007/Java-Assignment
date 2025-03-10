import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter gender input (M/F)
        System.out.print("Enter gender (M for Male, F for Female): ");
        char gender = scanner.next().charAt(0);  // Read the first character input
        
        // Using switch to print gender
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input! Please enter 'M' for Male or 'F' for Female.");
        }
        
        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
