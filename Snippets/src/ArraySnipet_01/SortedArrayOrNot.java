package ArraySnipet_01;

public class SortedArrayOrNot {
	
	public static boolean issorted(int [] arr) {
		for ( int i=0; i<arr.length - 1; i++) {
			if( arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,65,78,45,23,88,65};
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		
	        System.out.println( " example 1 "+ issorted(arr));
	        
	        System.out.println( " example 2 "+ issorted(arr1));
	}
}