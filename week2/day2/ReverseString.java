package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "TestLeaf";
		char charac1;
		String reverseStr = "";
		System.out.println("The Given string is " + companyName);
		for (int i = 0; i < companyName.length(); i++) {	
			charac1 = companyName.charAt(i);
			reverseStr = charac1 + reverseStr; 
			//System.out.println(charac1);
			//System.out.println(reverseStr);
		}
		System.out.println("------------------");
		System.out.println("Reversed String is " + reverseStr);
	}

}
