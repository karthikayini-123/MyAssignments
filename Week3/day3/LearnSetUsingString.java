package Week3.day3;
import java.util.LinkedHashSet;

import java.util.Set;

public class LearnSetUsingString {

	public static void main(String[] args) {
		String companyName = "google";
		char[] charac = companyName.toCharArray();
		System.out.println(charac);
		Set<Character> newset = new LinkedHashSet<Character>();
		for(int i=0;i<charac.length;i++) {
			newset.add(charac[i]);
			
		}
		System.out.println("The final set is: " +	newset);
		

	}

}
