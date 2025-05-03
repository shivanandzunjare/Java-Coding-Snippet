package stringSnipet_01;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class FirstRepeatChar {
	
	public static Character findFirstRepeatChar(String str) {
		HashSet<Character> seenChar= new HashSet<>();
		//LinkedList<Integer> obj = new LinkedList<>();
		//Vector<String> obb = new Vector<>();
 		for( char c : str.toCharArray()) {
			if(seenChar.contains(c)) {
				return c;
			}
			seenChar.add(c);
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "mdam";
		Character firstRepeat = findFirstRepeatChar(input);
		if (firstRepeat != null) {
			System.out.println("first repeat is -->"+ firstRepeat);
		}else {
			System.out.println( "no repeated " );
		}
	}

}
