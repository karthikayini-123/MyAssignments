package Week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']"));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
	
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
		//verify Page title is Dashboard
		if(pageTitle.equals("Dashboard"))
		{
			System.out.println("Page Tile: " + pageTitle + " is Verified Successfully");
		}
		else {
			System.out.println("Page Title does not Match");
		}
		driver.navigate().back();
		
		//Check if Confirm if the button is disabled
			
		boolean enabled = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
		if (enabled == false)
		{
			System.out.println("Confirm button is Disabled  : " +enabled);
		}
		else {
			System.out.println("Confirm button is Enabled  : " +enabled);
		}
		
		Point location = driver.findElement(By.xpath("//span[text()='Submit'][1]")).getLocation();
		System.out.println("Button position : " +location);
		
		String value = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("Background Color of the button  :  " + value);
		
		Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println("Height and Width of the button size is :  " + size);
		
		driver.close();
	}

}
