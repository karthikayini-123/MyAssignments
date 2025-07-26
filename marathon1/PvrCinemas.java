package Week3.marathon1;


import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//Navigate to Cinema Button
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		//Select Cinema location		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		//driver.findElement(By.xpath("(li[@class='p-dropdown-item p-highlight'])[1]")).click();
		
		//Select Date
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		//Select Movie
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='THE FANTASTIC FOUR: FIRST STEPS']")).click();
		
		//Select Timings
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='03:35 PM']")).click();
		
		//Click Book Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		
		//Accept Terms and conditions
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//Select Seat
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='SL.SILVER|F:14']")).click();
		
		//Click Proceed Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//TO Print Seat Info
		Thread.sleep(3000);
		String seatInfo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Booked Seat number: " + seatInfo);
		
		//To Print GrandTotal
		Thread.sleep(3000);
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println("PaymentDetails: " + grandTotal);
		
		//Click Continue Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		//Close the Pop-UP
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//print the current page title
		Thread.sleep(5000);
		String pageTitle = driver.getTitle();
		System.out.println("The Current Page Title is :" + pageTitle);
		
		//close the browser
		Thread.sleep(2000);
		driver.close();
			
	}

}
