package Week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameandAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(frameElement);
		
		//Click 'Try it' button 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alertele = driver.switchTo().alert();
		
		//Enter name as Ben
		alertele.sendKeys("Ben");
		alertele.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("The Text is: " + text );
	
	}
}
