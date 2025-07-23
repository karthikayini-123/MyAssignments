package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

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
		
		//Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the CreateLead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		
		//Handling dropdown
		//Step1: Find the element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step2: Create an Object for Select Class
		Select options=new Select(sourceElement);
		
		//Step3: Use the method to select to Select the value	
		options.selectByValue("LEAD_EXISTCUST");
		
		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sales Manager");

		WebElement industryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select options1=new Select(industryElement);
		options1.selectByValue("IND_SOFTWARE");
			
		//Click on the Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		driver.getTitle();
		driver.close();
		
		
	}

}
