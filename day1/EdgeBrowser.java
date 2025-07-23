package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser openBrowser = new Browser();
		String gchrome = openBrowser.launchBrowser();
		System.out.println(gchrome);
		openBrowser.loadUrl();
	}

}
