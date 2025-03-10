package io.github.jiangdequan;

public class PrivateField {

    private int privateField1 = 10;

    private void privateMethod() {
        System.out.println("Private Method Called");
    }

    public static void main(String[] args) {
        // Creating an instance of PrivateField
        PrivateField example = new PrivateField();

        // Accessing privateField1 and privateMethod within the same class
        System.out.println("Private Field 1: " + example.privateField1);

        example.privateMethod();
    }
}
