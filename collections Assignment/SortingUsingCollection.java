package week6.day4collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		String[] cpyName= {"HCL", "Wipro",  "Aspire Systems", "CTS"};

		// get the length of the array	
	int length = Array.getLength(cpyName);
	System.out.println( "The Array Length is :"+ length);
	List<String> name=new ArrayList<String>();
	for(int i=0;i<cpyName.length;i++) {
		name.add(cpyName[i]);
	}
	// sort the array	
	Collections.sort(name);
	// Iterate it in the reverse order
	Collections.reverse(name);
	// print the array
	System.out.println(name);

	}

}
