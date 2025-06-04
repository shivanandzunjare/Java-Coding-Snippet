package ArraySnipet_03;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {11,22,33,44};
		int [] arr2 = {77,88,89,95,99};
		int [] mergedArray = mergeSortedArrays(arr1, arr2);
		
		System.out.println(" merged sorted array" + Arrays.toString(mergedArray));
	}

	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int [] mergedArray = new int[n1 + n2];
		int i=0, j=0, k=0;
		// Merge both arrays while maintaining sorted order
		while( i< n1 && j< n2) {
			if(arr1[i] <= arr2[j]) {
				mergedArray[k++] = arr1[i++];
			}
			else 
				mergedArray[k++] = arr2[j++];
		}
		// Copy remaining elements of arr1

		while(i < n1) {
			mergedArray[k++] = arr1[i++];
		}
		
		while (j < n2) {
			mergedArray[k++] = arr2[j++];
		}
		return mergedArray;
	}

}