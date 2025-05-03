package ArraySnipet_02;

import java.util.HashSet;

public class DuplicateInArray {
	public static HashSet<Integer> findDuplicate(int [] arr) {
		HashSet<Integer> duplicates = new HashSet<>();
		HashSet<Integer> seen = new HashSet<>();
		
		for ( int num : arr) {
			if(!seen.add(num)) {
				duplicates.add(num);
			}
		}
		return duplicates;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,5,2,5,6,2};
		findDuplicate(arr);
		System.out.println(" duplicates" + findDuplicate(arr));
	}

}
