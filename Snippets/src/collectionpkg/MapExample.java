package collectionpkg;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "B");
        hashMap.put(1, "A");
        hashMap.put(3, "C");
        System.out.println("HashMap: " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //insertion order
        linkedHashMap.put(2, "B");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(3, "C");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();  // sorted
        treeMap.put(2, "B");
        treeMap.put(1, "A");
        treeMap.put(3, "C");
        System.out.println("TreeMap: " + treeMap);
    }
}

