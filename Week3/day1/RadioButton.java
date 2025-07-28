package Week3.day1;

public class RadioButton extends Button {
	
	public void selectRadioButton()
	{
		System.out.println("Radio Button Clicked Successfully");
	}

	public static void main(String[] args) {
		
		RadioButton radioobj = new RadioButton();
		radioobj.submit();
		radioobj.selectRadioButton();
	}
}
