package Week3.day1;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton()
	{
		System.out.println("CheckBox Button Clicked Successfully");
	}
	
public static void main(String[] args) {
		
		CheckBoxButton checkobj = new CheckBoxButton();		
		checkobj.submit();
		checkobj.clickCheckButton();

	}

}
