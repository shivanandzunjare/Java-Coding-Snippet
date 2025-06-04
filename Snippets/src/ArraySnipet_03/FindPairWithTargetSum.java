package ArraySnipet_03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPairWithTargetSum {

	public static void main(String[] args) {
	
		int [] arr = {1,2,3,4,5,6,7};
		int target = 8;
		
		findPair(arr, target);
		
	}

	private static void findPair(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		boolean pairFound = false;
		
		for(int num : arr) {
			int complement = target - num;
			if(map.containsKey(complement)) {
				System.out.println("pair found : (" + complement + "," + num +")");
				pairFound = true;
			}
			map.put(num, 1);
		}
		if(!pairFound) {
			System.out.println(" pair not found with target sum");
		}
		
	}

}
