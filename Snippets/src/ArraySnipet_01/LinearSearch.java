package ArraySnipet_01;

public class LinearSearch {
	
	public static int linearSearch(int []arr, int key) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 25, 30, 45, 50};
		int k = 30;
		
		int result = linearSearch(arr, k);
		
		if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
	}

}
