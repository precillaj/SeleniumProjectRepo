package FirstTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Open app
 * Test logo presence
 * login
 * Close
 */

public class OrangeHRMTest 
{
	private WebDriver driver;
	
		
	@Test(priority=1)
	void applaunch()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean logopresence = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo Presence is -> " + logopresence);
		
	}
	
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
				
	}
	
	
	@Test(priority=4)
	void logout()
	{
		//driver.findElement(By.xpath("./ancestor::li[@class='oxd-userdropdown-name']/ul/li/[normalize-space()='Logout']")).click();
		driver.close();
		driver.quit();
	}
	
	
	
	
}
