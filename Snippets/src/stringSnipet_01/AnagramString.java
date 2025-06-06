package stringSnipet_01;

import java.util.Arrays;
public class AnagramString {
	public static boolean areAnagram(String str1, String str2) {
		str1 = str1.toLowerCase().replace("\\s", "");
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if( str1.length() != str2.length()) return false;
		
		char [] charArray1 = str1.toCharArray();
		char [] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		if(areAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2+ " are anagram");
		}
	}
}
