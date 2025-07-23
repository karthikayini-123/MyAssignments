package Week2.day3;

import org.openqa.selenium.By;
//simport org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");	
		
		ChromeDriver driver= new ChromeDriver(opt);
		//EdgeDriver driver = new EdgeDriver();	

		// Load Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the Browser
		driver.manage().window().maximize();
		
		
		//T0 Click Continue to site button		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='proceed-button']")).click();
		
		// Enter the username
		driver.findElement(By.id("username")).sendKeys("democsr");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Accounts link
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Johnny");
	
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps”");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		//Click on the CreateAccount link
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.getTitle();
		driver.close();
	}

}
