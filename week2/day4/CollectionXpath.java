package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionXpath {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			ChromeDriver driver= new ChromeDriver();

			// Load Url
			driver.get("https://www.flipkart.com/");

			// Maximize the Browser
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Men's shirts");
			
			
	}

}
