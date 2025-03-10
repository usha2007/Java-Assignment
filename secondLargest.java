package io.github.jiangdequan;

public class secondLargest {
    public class Main {
        public static int secondLargest(int[] arr) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
            return secondLargest;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Second Largest: " + secondLargest(arr));
        }
    }
    
}