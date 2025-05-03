package ArraySnipet_01;

import java.util.Arrays;

public class ReverseArray {
	
//	public static void reverseArray( int [] arr) {
//		int left = 0, right = arr.length-1;
//		int temp = 0;
//		while( left < right) {
//			 temp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = temp;
//		left++;
//		right--;
//		}	
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,65,78,45,88,65};
		System.out.println(" before reverse array"+ Arrays.toString(arr));
//		reverseArray(arr);
		
		int left = 0, right = arr.length-1;
		int temp = 0;// using two approach 
		while( left < right) {
			 temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
		}	
		
		System.out.println(" reversed array"+ Arrays.toString(arr));

	}
}