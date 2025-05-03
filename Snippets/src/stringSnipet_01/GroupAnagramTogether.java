package stringSnipet_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Map<String, List<String>> anagramGroups = new HashMap<>();
		
		for(String word : words) {
			// Convert word to char array and sort to get a common key
			char chars [] = word.toCharArray();
			Arrays.sort(chars);
			
			String sorted = new String(chars); ; // this is the key

            // Add word to the correct group in the map
			anagramGroups.computeIfAbsent(sorted, k-> new ArrayList<>()).add(word);
			
			
		}
		// Print grouped anagrams
        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
	}

}
