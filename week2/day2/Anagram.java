package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops"; 
		String text2 = "potss";
		
		if(text1.length() == text2.length()) {
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println("The given strings are Anagram");			
			}
			else {
				System.out.println("The given strings are NOT an Anagram");
			}
		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}
