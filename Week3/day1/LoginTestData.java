package Week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername()
	{
		System.out.println("UserName is Entered");
	}
	
	public void enterPassword()
	{
		System.out.println("Password is Entered");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData credentials = new LoginTestData();
	
		credentials.enterUsername();
		credentials.enterPassword();
		credentials.enterCredentials();
		credentials.navigateToHomePage();
		
	}

}
