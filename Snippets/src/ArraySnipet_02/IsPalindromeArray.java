package ArraySnipet_02;

public class IsPalindromeArray {
	public static boolean isPalindrome(int [] arr) {
		int left = 0; 
		int right = arr.length -1;
		
		while( left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,2,1};
		 if (isPalindrome(arr)) {
	            System.out.println("The array is a palindrome.");
	        } else {
	            System.out.println("The array is NOT a palindrome.");
	        }
	}
}
