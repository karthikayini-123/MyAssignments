package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");	
		ChromeDriver driver= new ChromeDriver(opt);
		
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
		
		//Click on Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on Phone Tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter Phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99623897");
		
		//Click Button Find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture the Lead ID value
		Thread.sleep(5000);
		WebElement leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String value = leadId.getText();
		System.out.println("Captured Lead id :" + value);
		
		//Click the First resulting Lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Click Delete Lead button
		Thread.sleep(5000);
		driver.findElement(By.linkText("Delete")).click();
		
		//Click on Find Leads again
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter captured Lead ID 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(value);
		
		//click Find Lead button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify the message
		Thread.sleep(3000);
		String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(message);
		
		if(message.equals("No records to display"))
		{
			System.out.println("Successfully Deleted the Lead");
		}
		else
			System.out.println("Lead not deleted");
		driver.close();
	
	}

}
