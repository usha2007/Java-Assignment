package io.github.jiangdequan;

import java.util.HashSet;
import java.util.Iterator;

public class CollEx3 {

    public static void main(String[] args) {

        // 1. Create a HashSet with at least 10 elements of type String
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Mango");
        fruitSet.add("Pineapple");
        fruitSet.add("Grapes");
        fruitSet.add("Peach");
        fruitSet.add("Plum");
        fruitSet.add("Kiwi");
        fruitSet.add("Strawberry");

        System.out.println("Original HashSet: " + fruitSet);

        // 2. Add an element to the HashSet
        fruitSet.add("Watermelon");
        System.out.println("\nAfter adding 'Watermelon': " + fruitSet);

        // 3. Remove an element from the HashSet
        fruitSet.remove("Peach");
        System.out.println("\nAfter removing 'Peach': " + fruitSet);

        // 4. Check if an element exists in the HashSet
        boolean containsMango = fruitSet.contains("Mango");
        System.out.println("\nDoes the set contain 'Mango'? " + containsMango);

        // 5. Check the size of the HashSet
        int size = fruitSet.size();
        System.out.println("\nSize of the HashSet: " + size);

        // 6. Iterate through the HashSet using an iterator
        System.out.println("\nIterating through the HashSet:");
        Iterator<String> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7. Remove all elements from the HashSet
        fruitSet.clear();
        System.out.println("\nAfter clearing all elements: " + fruitSet);

        // 8. Check if the HashSet is empty
        boolean isEmpty = fruitSet.isEmpty();
        System.out.println("\nIs the HashSet empty? " + isEmpty);

        // Re-add elements to demonstrate the remaining operations
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Mango");
        fruitSet.add("Pineapple");
        fruitSet.add("Grapes");
        fruitSet.add("Peach");
        fruitSet.add("Plum");
        fruitSet.add("Kiwi");
        fruitSet.add("Strawberry");

        // 9. Create a clone of the HashSet
        HashSet<String> clonedSet = (HashSet<String>) fruitSet.clone();
        System.out.println("\nCloned HashSet: " + clonedSet);

        // 10. Check if the HashSet contains all elements of another HashSet
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Banana");
        boolean containsAll = fruitSet.containsAll(anotherSet);
        System.out.println("\nDoes the HashSet contain all elements from another set? " + containsAll);
    }
}
