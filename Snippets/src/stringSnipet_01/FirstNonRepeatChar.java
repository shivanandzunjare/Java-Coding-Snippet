package stringSnipet_01;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {
	public static Character findFirstNonRepeatChar( String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		 
		for( char ch : str.toCharArray()) {
			 charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		 }
		 for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
			 if(entry.getValue() == 1) {
				 return entry.getKey();
			 }
		 }
		 return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "madam";
	 Character nonRepeat =	findFirstNonRepeatChar(input);
	 if( nonRepeat != null) {
		 System.out.println("first non repeated char is ->" + nonRepeat);
	 }else {
		 System.out.println(" not firstnon repeated char ");
	 }

	}

}
