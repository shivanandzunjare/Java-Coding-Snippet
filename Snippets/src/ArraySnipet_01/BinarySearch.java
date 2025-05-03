package ArraySnipet_01;

public class BinarySearch {
	public static int binarySearch(int [] arr, int k) {
		int left = 0, right = arr.length-1;
		while (  left <= right) {
			int mid = (left + right) / 2;
			if( k == arr[mid]) return mid;
			if( k < arr[mid]) 
				right = mid - 1;
			else 
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 25, 30, 45, 50};
		int k = 50;
		int result = binarySearch(arr, k);
		
		if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
	}
}