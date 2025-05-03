package stringSnipet_01;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfeachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "banana";
		Map<Character, Integer> charCount = new HashMap<>();
		for(char ch : input.toCharArray()) {
			// Check if character already exists in the map
			if ( charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) + 1);
			} else {
				charCount.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : charCount.entrySet() ) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		

	}

}
