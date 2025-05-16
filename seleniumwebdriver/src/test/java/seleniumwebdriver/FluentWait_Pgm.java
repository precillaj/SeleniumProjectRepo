package seleniumwebdriver;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_Pgm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Fluent wait Declaration
		Wait<WebDriver> pageFluentwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
			
		try
		{
			
			// Applying Fluent Wait for UName
			WebElement Uname = pageFluentwait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder='Username']"));
				}			
			});
			//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			Uname.sendKeys("Admin");
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
			// Applying Fluent Wait for UName
			WebElement NextPgTitle = pageFluentwait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
				}			
			});
			//driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
			NextPgTitle.isDisplayed();
			
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Element not Found -> " + e.getMessage());			
		}
		

	}

}
