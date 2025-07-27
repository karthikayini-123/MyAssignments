package Week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmationAlert {

		public static void main(String[] args) throws InterruptedException{
			// TODO Auto-generated method stub
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
			Alert confirmAlert = driver.switchTo().alert();
			String text = confirmAlert.getText();
			System.out.println("The Text is: " + text );
			Thread.sleep(5000);
			confirmAlert.accept();
	}

}
