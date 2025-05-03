package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
          List<Integer> evenNum = numbers
        		  .stream()
        		  .filter(n -> n % 2 == 0)
        		  
        		  .collect(Collectors.toList());
          System.out.println(evenNum);
          
          List<String> names = Arrays.asList("john", "doe", "alice");
          List<String> upperCaseNames = names
        		  .stream()
        		  .map(String::toUpperCase)
        		  .collect(Collectors.toList());
          System.out.println(upperCaseNames);
          
          List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
          int sum = nums
        		  .stream()
        		  .reduce(0, Integer::sum);
          System.out.println(sum);
          
          List<Integer> obj = Arrays.asList(5, 12, 18, 7, 25);
             long count = obj
            		 .stream()
            		 .filter(n -> n > 10)
            		 .count();
             System.out.println(count);
          
	}
	
}
