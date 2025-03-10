package io.github.jiangdequan;

public class minMax {
    public class Main {
        public static int[] minMax(int[] arr) {
            int min = arr[0];
            int max = arr[0];
            for (int num : arr) {
                if (num < min) min = num;
                if (num > max) max = num;
            }
            return new int[]{min, max};
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] result = minMax(arr);
            System.out.println("Min: " + result[0] + ", Max: " + result[1]);
        }
    }
    
}