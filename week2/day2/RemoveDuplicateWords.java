package week2.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] word = text.split(" ");
		String result="";
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equalsIgnoreCase(word[j])) {
					word[j] = "";
					count++;
				}

			}
		}
		if (count > 0)
		{
	
			for (int k = 0; k < word.length; k++) {
				if (word[k] != "") 
				{

					result += word[k] + " ";
				}
			}
			System.out.println(result);
		}
		else 
		{
			System.out.println("No duplicates found.");
		}
	}

}
