public class VariableScopeExample {
    // Global variable
    int num = 20;

    public void display() {
        // Local variable
        int num1 = 10;

        // Print the local variable
        System.out.println("Local variable: " + num1);

        // Print the global variable using 'this' keyword
        System.out.println("Global variable: " + this.num);
    }

    public static void main(String[] args) {
        // Create an object of VariableScopeExample
        VariableScopeExample example = new VariableScopeExample();

        // Call the display method
        example.display();
    }
}
