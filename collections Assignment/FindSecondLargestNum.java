package week6.day4collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNum {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				 // Create a empty Set Using TreeSet
				Set<Integer>value=new TreeSet<Integer>();
				 // Declare for loop iterator from 0 to data.length and add into Set 
				for (int i = 0; i < data.length; i++) {
					value.add(data[i]);
					
				}
				 //converted Set into List
				List<Integer>number=new ArrayList<Integer>(value);
				 // Print the second last element from List
				System.out.println(number.get(number.size()-2));

	}

}
