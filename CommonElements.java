import java.util.HashSet;

public class CommonElements {

    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements from the first array to the set
        for (int num : arr1) {
            set.add(num);
        }
        
        // Check if elements from the second array exist in the set
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println("Common Element: " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        
        // Find and print common elements
        findCommonElements(arr1, arr2);
    }
}
