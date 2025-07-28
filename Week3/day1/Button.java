package Week3.day1;

public class Button extends WebElement {
	
	public void submit()
	{
		System.out.println("Submit Button ");
	}
	
	public static void main(String[] args) {
		
		Button buttonobj = new Button();
		buttonobj.click();
		buttonobj.setText("Message Received");
		buttonobj.submit();
		
	}

}
