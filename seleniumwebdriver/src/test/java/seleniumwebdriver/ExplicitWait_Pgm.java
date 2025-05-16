package seleniumwebdriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait_Pgm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait pagewait = new WebDriverWait(driver, Duration.ofSeconds(10));		// Declaration of Explicit wait
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		try 
		{
			WebElement Uname = pagewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));		// Explicit wait applied
			Uname.sendKeys("Admin"); 
			//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			
			WebElement Pwd = pagewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
			Pwd.sendKeys("admin123");		
			//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			
			WebElement Loginbtn = pagewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class, 'login-button')]")));
			Loginbtn.click();		
			//driver.findElement(By.xpath("//*[contains(@class, 'login-button')]")).click();
			//Thread.sleep(1000);
			
			WebElement pagetitle = pagewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='Dashboard']")));		
			//Boolean pagetitle = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
			if (pagetitle.isDisplayed())
			{
				System.out.println("Page Title -> " + pagetitle);
			}
			else
			{
				System.out.println("Test Failed");
			}
		}
		catch (NoSuchElementException e) 
		{
			System.out.println("Element not found" + e.getMessage());			
		}
		
		driver.close();
		driver.quit();

	}

}
