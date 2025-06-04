package ArraySnipet_03;

import java.util.Arrays;

public class MaxProductOfTwoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {11,0,22,39,44,87,55,66,0,34};
		
		if(arr.length < 2) {
			System.out.println("Array must have two integers");
		}
		int n = arr.length;
		
		for( int i=0; i<n; i++) {
			for( int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.err.println(Arrays.toString(arr));
		
		int maxProduct = arr[n-1] * arr[n-2];
		System.out.println(" max product of two integers " + arr[n-1] + " , " + arr[n-2]+" is " +maxProduct);

	}

}
