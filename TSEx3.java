package io.github.jiangdequan;

public class TSEx3 {

    // Constructor 1: Default constructor
    public TSEx3() {
        System.out.println("Default constructor called");
    }

    // Constructor 2: Constructor with parameters
    public TSEx3(String name) {
        // Calling the default constructor using this()
        this();  // This calls the default constructor
        System.out.println("Parameterized constructor called with name: " + name);
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        TSEx3 obj = new TSEx3("John");
    }
}
