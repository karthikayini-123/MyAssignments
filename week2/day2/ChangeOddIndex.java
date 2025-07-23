package week2.day2;


public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] ch1 = test.toCharArray();
	
		System.out.println(ch1);

		for(int i=0; i<=test.length();i++)
		{

			if (i % 2 == 1) {
		
				ch1[i] = Character.toUpperCase(ch1[i]);	
			}
		}
		System.out.println("The final string is " );
		System.out.println(ch1);
	}

	

}
