package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("dhruvanthsuresh22@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("****");
		driver.findElement(By.name("login")).click();

		
		
	}

}
