package collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map =	new HashMap<>();
		map.put(1, "Java");
		map.put(2, "python");
		map.put(3, "Javascript");
		
		// Method 1: Using forEach (Java 8+)
		map.forEach((key, value)-> System.out.println(key+ "->" + value));
		
		//iterating map using entrySet()
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key " + entry.getKey() +", value " + entry.getValue());
		}
		
	       // Method 3: Using keySet
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Method 4: Using values
        for (String value : map.values()) {
            System.out.println(value);
        }
	}
}
