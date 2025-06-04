package stringSnipet_01;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "babad";
		String result = longestPalindrome(input);
		System.out.println(" longest substring palindrome"+ result);

	}

	private static String longestPalindrome(String s) {
		// TODO Auto-generated method stub
		if( s == null  || s.length() < 1) return "";
		int start = 0, end = 0;
		for( int i=0; i< s.length(); i++) {
			int len1 = expandFromCenter(s, i, i);
			int len2 = expandFromCenter(s, i, i+1);
			int len = Math.max(len1, len2);
			if(len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private static int expandFromCenter(String s, int left, int right) {
		// TODO Auto-generated method stub
		while( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left -1;
	}

}
