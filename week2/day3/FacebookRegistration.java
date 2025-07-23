package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		//Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Karthi");
		driver.findElement(By.name("lastname")).sendKeys("suresh");
		
		WebElement birthdayElement1 = driver.findElement(By.id("day"));
		Select choose1=new Select(birthdayElement1);
		choose1.selectByValue("22");
		
		
		WebElement birthdayElement2 = driver.findElement(By.id("month"));
		Select choose2=new Select(birthdayElement2);
		choose2.selectByValue("6");
		

		WebElement birthdayElement3 = driver.findElement(By.id("year"));
		Select choose3=new Select(birthdayElement3);
		choose3.selectByValue("2010");
		
		//driver.findElement(By.value("2")).click();
		

		WebElement genderElement = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		
		genderElement.click();
		
		
	}
}
