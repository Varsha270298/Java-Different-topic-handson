package string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
      
		List<Integer> numbers = Arrays.asList(2,3,4 ,5,6,8,56,45,34,23);
		
		System.out.println("original list:"+numbers);
		Collections.sort(numbers);
		System.out.println("sorted list:"+numbers);
		
		//descending order 
		numbers.sort(Collections.reverseOrder());
		
		System.out.println("sorted list:"+numbers);


		
		
		
		
		
		
		
	}

}
