package ArraySnipet_01;

public class SmallestAndLargestArray {
	
	public static void findMinMax(int [] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for ( int num : arr) {
			if( num > max ) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("max--> " + max);
		
		System.out.println("min--> " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,65,78,45,88,65};
		findMinMax(arr);
	}
}