package Week3.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Maximize the browser

		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.amazon.in/");
	
		//Search bags for boys
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		
		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		
		//Print the total number of results
		String ResultText = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String ResultText1 = driver.findElement(By.xpath("(//span[contains(text(),'bags for boys')])[1]")).getText();
		System.out.println("Total Number of results: " + ResultText +" " + ResultText1);
		
		
		//Select 'Newest Arrivals' from sort
		driver.findElement(By.className("a-dropdown-container")).click();		 
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		//Print bag info (Name)
		String NameElement = driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])/span[1]")).getText();
	    System.out.println("Bag name is: " + NameElement);
	    
	    //Print bag info (discounted price)
	    String priceText3 = driver.findElement(By.className("a-price")).getText();
	    System.out.println("Bag price: " + priceText3);
	    
	    //Get page title
	    String pageTitle = driver.getTitle();
	    System.out.println("PageTitle is: " + pageTitle);
	    
	    //close the browser
	    driver.close();
	}

}
