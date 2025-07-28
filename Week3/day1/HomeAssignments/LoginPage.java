package Week3.day1.HomeAssignments;

public class LoginPage extends BasePage {
	
	public void performCommonTasks()
	{
		super.performCommonTasks();
		System.out.println("PerformCommonTasks method from Login Page Subclass");
	}

	public static void main(String[] args) {
		
		LoginPage obj = new LoginPage();
		obj.performCommonTasks();
		obj.findElement();
		obj.clickElement();
		obj.enterText();
		

	}

}
