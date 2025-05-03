package ArraySnipet_02;

public class FindMissingEle {
	
	public static int findMissingElement( int [] arr, int n) {
		
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		
		for ( int num : arr) {
			actualSum = actualSum + num;
		}
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = {1,2,3,5,6};  //4
		int n = array.length + 1 ;
		int missingNumber = findMissingElement(array, n);
    System.out.println(" missing number is " + missingNumber);
	}

}
