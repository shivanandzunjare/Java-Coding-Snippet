package stringSnipet_01;

import java.util.HashMap;

public class ReverseString {
	
	public static String reverse(String str) {
		char [] charArray = str.toCharArray();
		//using two-pointer approach
		int left = 0 , right = str.length() - 1;
		while( left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] =  temp;
			left++;
			right--;
		}
		return new String(charArray);
		
	}

	public static void main(String[] args) {
		String str = "Hello";
		char [] charArray = str.toCharArray();
	//	HashMap<Integer, String> hm = new HashMap<>();
	//	System.out.println(" reversed --> " + reverse(str));
		int left = 0 , right = str.length() - 1;
		while( left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] =  temp;
			left++;
			right--;
		}
		System.out.println(charArray);

	}

}
