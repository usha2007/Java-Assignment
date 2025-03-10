import java.util.LinkedHashSet;
public class removeDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        // Using LinkedHashSet to preserve the order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        // Add elements to the set (duplicates will be automatically removed)
        for (int num : arr) {
            set.add(num);
        }
        
        // Convert the LinkedHashSet back to an array
        int[] newArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            newArr[i++] = num;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        
        // Remove duplicates
        int[] newArr = removeDuplicates(arr);
        
        // Print the array without duplicates
        System.out.print("Array without duplicates: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
