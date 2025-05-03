package collectionpkg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("BMW", 1000);
		map.put("Audi", 300);
		map.put("Ferrari", 200);
		
		//sorting by value
		
		Map<String, Integer> sortedMap = map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey	, Map.Entry::getValue,
						(e1, e2)-> e1, LinkedHashMap:: new));
		System.out.println("sorted Map"+ sortedMap);

	}

}
