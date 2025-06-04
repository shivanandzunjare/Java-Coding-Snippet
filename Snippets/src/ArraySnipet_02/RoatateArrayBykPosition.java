package ArraySnipet_02;

import java.util.Arrays;
import java.util.Scanner;

public class RoatateArrayBykPosition {
	
	public static void rotateArray(int [] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n-1); //full reverse 
		
		reverse(arr, 0, k-1); // reverse 0 to k-1
		
		reverse(arr, k, n-1); //reverse k to length - 1
		
	}
	
	public static void reverse(int [] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		System.out.println("enter the element of array");
		int [] arr = new int[n];
		for( int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the number of position to rotate");
		int k = sc.nextInt();
		
		rotateArray(arr, k);
		
		System.out.println("Array after rotation" + Arrays.toString(arr));
		
		sc.close();

	}

}
