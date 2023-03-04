package week6.day4collection;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		// Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		String[] split=text.split ("  ");
		//Create a empty Set
		Set<String>words=new TreeSet<String>();
		for (int i = 0; i<split.length; i++) {
			words.add(split[i]);
			
			
			
		}
		System.out.println(words);

	}

}
