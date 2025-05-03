package ArraySnipet_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZeroStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {11,0, 44, 0, 77, 0, 0, 33};
		
		int nonZeroIndex = arr.length - 1; ;
		for ( int i = arr.length - 1 ; i >= 0; i--) {
			if (arr[i] != 0 ) {
				int temp = arr[i];
				 arr[i] = arr[nonZeroIndex] ;
				 arr[nonZeroIndex] = temp;
				 nonZeroIndex--;
			}
		}
		System.out.println(" after moving " + Arrays.toString(arr));

	}

}
