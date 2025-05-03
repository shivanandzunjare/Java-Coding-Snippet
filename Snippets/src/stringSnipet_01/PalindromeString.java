package stringSnipet_01;

public class PalindromeString {
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length()- 1;
		while( left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("hello"));

	}

}
