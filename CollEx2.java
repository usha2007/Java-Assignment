import java.util.HashMap;

public class CollEx2 {

    public static void main(String[] args) {

        // Create a HashMap with 10 key-value pairs (Student ID, Name)
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Inserting 10 key-value pairs into the map
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // 1. Insert a Key-Value mapping into the map
        studentMap.put(111, "Kathy"); // Inserting new student with ID 111
        System.out.println("After inserting a new student: " + studentMap);

        // 2. Fetch the value of a Key
        String studentName = studentMap.get(103); // Fetch the name of student with ID 103
        System.out.println("\nThe student with ID 103 is: " + studentName);

        // 3. Create a clone/copy of the HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("\nCloned map: " + clonedMap);

        // 4. Check if the given Key is in the map
        boolean isKeyPresent = studentMap.containsKey(107); // Check if student ID 107 exists
        System.out.println("\nIs student ID 107 present in the map? " + isKeyPresent);

        // 5. Check if the value is in the map
        boolean isValuePresent = studentMap.containsValue("Eve"); // Check if 'Eve' exists in the map
        System.out.println("\nIs 'Eve' present in the map? " + isValuePresent);

        // 6. Check if the map is empty
        boolean isEmpty = studentMap.isEmpty(); // Check if the map is empty
        System.out.println("\nIs the map empty? " + isEmpty);

        // 7. Print the size of the Map
        int size = studentMap.size();
        System.out.println("\nSize of the map: " + size);

        // 8. Print all the Keys of the map
        System.out.println("\nAll student IDs (Keys) in the map:");
        for (Integer key : studentMap.keySet()) {
            System.out.println(key);
        }

        // 9. Print all the Values of the map
        System.out.println("\nAll student names (Values) in the map:");
        for (String value : studentMap.values()) {
            System.out.println(value);
        }

        // 10. Remove a specific Key-Value pair
        studentMap.remove(105); // Remove the student with ID 105
        System.out.println("\nAfter removing student with ID 105: " + studentMap);

        // 11. Copy all elements of the map to another map
        HashMap<Integer, String> newMap = new HashMap<>(studentMap); // Creating a copy of the studentMap
        System.out.println("\nNew map after copying elements: " + newMap);
    }
}
