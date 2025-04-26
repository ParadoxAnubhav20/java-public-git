import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap to store Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Printing all values from the HashMap
        System.out.println("HashMap Values:");
        for (String s : hashMap.values()) {
            System.out.print(s + "\t");
        }
        System.out.println("\n");

        // Printing all key-value pairs from the HashMap
        System.out.println("HashMap Key-Value Pairs:");
        for (Integer key : hashMap.keySet()) {
            System.out.printf("Key: %d -> Value: %s%n", key, hashMap.get(key));
        }
        System.out.println();

        // Creating a TreeMap to store Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Solo");
        treeMap.put(9, "Levelling");
        treeMap.put(2, "Is");
        treeMap.put(6, "Action");
        treeMap.put(5, "Anime");

        // Printing all key-value pairs from the TreeMap (sorted order)
        System.out.println("TreeMap Key-Value Pairs:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.printf("%d -> %s ", entry.getKey(), entry.getValue());
        }
        System.out.println("\n");

        // Using an Iterator to traverse the TreeMap
        System.out.println("TreeMap using Iterator:");
        Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
