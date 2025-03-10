package io.github.jiangdequan;

public class TSEx1 {
    public static void main(String[] args) {
        // Creating an object to call the method
        Person person = new Person("Alice", 30);

        // Calling the method which prints fields using 'this'
        person.printFields();
    }
}

// Moved the `Person` class outside
class Person {
    // Instance members (fields)
    String name;
    int age;

    // Constructor to initialize the instance members
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print the fields using the 'this' keyword
    void printFields() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
