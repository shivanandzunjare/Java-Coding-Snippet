package ArraySnipet_03;

import java.util.HashSet;

public class CommonEleInTwoUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {55,66,0,34,56,98};
		int [] arr2 = {11,0,22,55,66,0,34};
		
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> commonElements = new HashSet<>();
		
		for ( int num : arr1) {
			set.add(num);
		}
		
		for( int num : arr2) {
			if(set.contains(num)) {
				commonElements.add(num);
			}
		}
		if(commonElements.isEmpty()) {
			System.out.println(" there is no common elements");
		}
		else
			System.out.println(" common ele  are : " + commonElements);

	}

}
