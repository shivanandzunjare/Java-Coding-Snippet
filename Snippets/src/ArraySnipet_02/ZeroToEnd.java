package ArraySnipet_02;

import java.util.Arrays;

public class ZeroToEnd {

	public static void moveZeros(int [] arr) {
		int nonZeroIndex = 0;
		for ( int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = 	arr[i];
				 arr[i] = arr[nonZeroIndex] ;
				 arr[nonZeroIndex]   = temp;
				 nonZeroIndex++;
			}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 3, 12, 0, 5};
		
		moveZeros(arr);
		
	System.out.println(" after moving" + Arrays.toString(arr));
	}

}
