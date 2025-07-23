package week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester.";

		String[] array1 = test.split("\\s");

		String ouput = "";

		for (int i = 0; i < array1.length; i++) {

			if (i % 2 == 0)
				
				ouput += array1[i] + " ";

			if (i % 2 != 0) {
				String reversed = "";
				char[] ch = array1[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					reversed += ch[j];
				}
				//shorthand assignment operator that combines the addition operation with an assignment operation.
				ouput = reversed + " ";
			}
			
		}
		//to remove whitespace characters from a string. trim()
		System.out.println(ouput.trim());
	}
}
