package week2.day1;

public class Browser {

	public String launchBrowser() {
		System.out.println("Browser launched successfully");
		String browserName ="Chrome";
		return  browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application Url loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bname = new Browser();
		bname.launchBrowser();
		bname.loadUrl();
	}

}
