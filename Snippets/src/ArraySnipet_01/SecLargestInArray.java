package ArraySnipet_01;

public class SecLargestInArray {
	
	public static int findSecLargest(int [] arr) {
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for ( int num : arr) {
			if( num > largest) {
				secLargest = largest;
				largest = num;
			} else if(num > secLargest && num != largest) {
				secLargest = num ;
			}
		}
		return (secLargest == Integer.MIN_VALUE ? null : secLargest);
	}

	public static void main(String[] args) {
		int [] arr = {11,65,78,45,88,65};
		int seclarge = findSecLargest(arr);
		
		if ( seclarge == Integer.MIN_VALUE) {
			System.out.println(" no sec largets");
		}
		else {
			System.out.println(" second largets -->" + seclarge);
		}
	}
}