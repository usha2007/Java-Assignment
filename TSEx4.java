package io.github.jiangdequan;

public class TSEx4 {
    int a, b;

    // Constructor with two parameters
    public TSEx4(int x, int y) {
        this.a = x;
        this.b = y;
        System.out.println("Constructor with two arguments called");
    }

    // Constructor with one parameter
    public TSEx4(int x) {
        this(x, 0); // Calls the constructor with two parameters
        System.out.println("Constructor with one argument called");
    }

    // Constructor with no parameters
    public TSEx4() {
        this(0, 0); // Calls the constructor with two parameters
        System.out.println("Constructor with no arguments called");
    }

    // Method to display the values of 'a' and 'b'
    void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        // Create an object using the no-argument constructor
        TSEx4 obj1 = new TSEx4();
        obj1.display(); // Display the values of a and b

        // Create an object using the constructor with one argument
        TSEx4 obj2 = new TSEx4(5);
        obj2.display(); // Display the values of a and b

        // Create an object using the constructor with two arguments
        TSEx4 obj3 = new TSEx4(5, 10);
        obj3.display(); // Display the values of a and b
    }
}
