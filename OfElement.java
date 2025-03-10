package io.github.jiangdequan;

public class OfElement {
    
    public class Main {
        public static int indexOfElement(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1; // Return -1 if element not found
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Index of 3: " + indexOfElement(arr, 3));
        }
    }
}