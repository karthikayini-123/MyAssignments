package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("xyz");
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Benny");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Shaw");
		
		//Enter First Name(Local)
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ben");
		
		//Enter Description field
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Enter Departemnt
		driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
		
		//Enter Email Address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("benshaw@testleaf.com");
		
		
		//Enter the State/Province field
		WebElement stateElement = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select state=new Select(stateElement);
		state.selectByVisibleText("California");
		
		//Click on Create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Click Edit Lead
		driver.findElement(By.xpath(" //a[text()='Edit']")).click();
		
		//clear Description
		driver.findElement(By.name("description")).clear();
		
		//Fill Important Note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note Added");
		
		//click Update Button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		driver.close();

		
	}

}
