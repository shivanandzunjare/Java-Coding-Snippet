package stringSnipet_01;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {
	public static String removeDuplicate(String str) {
		Set<Character> seen = new LinkedHashSet<>();
		StringBuilder result = new StringBuilder();
		for( char c : str.toCharArray()) {
			if ( seen.add(c)) {
				result.append(c);
			}
		}
				
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicate("Hello World"));

	}

}
