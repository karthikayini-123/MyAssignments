package week2.day2;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="TestLeaf";
		 int num=0;
		 char[] ch= str.toCharArray();
		 for (int i = 0; i < ch.length; i++)
		 {
		
				if (ch[i] == 'e') 
				{
					num++;
				}
		 }

	 
	 System.out.println("The  Number of occurance of letter 'e' in the given string is " + num + ".");
	} 
		 
		 
 }


