public class DoWhile {
    public static void main(String[] args) {
        // Initialize the starting number
        int number = 1;

        // Use do-while loop to print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        do {
            System.out.print(number + " ");
            number++; // Increment the number by 1
        } while (number <= 10); // Continue the loop until the number exceeds 10
    }
}
