package Week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("chrome mode: openIncognito");
	}

	public void clearCache() {
		System.out.println("chache cleared");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chromevariable = new Chrome();
		chromevariable.openIncognito();
		chromevariable.clearCache();
		chromevariable.openURL();
		chromevariable.closeBrowser();
		chromevariable.navigateBack();
	}

}
