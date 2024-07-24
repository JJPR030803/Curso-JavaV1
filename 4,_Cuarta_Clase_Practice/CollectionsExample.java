import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }

        // Set
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2); // Duplicate, will not be added

        for (int number : numbers) {
            System.out.println(number);
        }

        // Map
        Map<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");

        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
