package MustKnowConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo 
{
	WebDriver driver;
	
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
	}
	
	@DataProvider (name = "dp", indices = {0,1})   // indices will execute data specific to mentioned index mentioned {0,1} 
												   // - will execute data in 1st & 2nd index, {0,4} will execute data in 1st & 4th index
	Object[][] loginData()
	{
		Object data[][] = {
						{"abcd04041@gmail.com","test@123"},
						{"abc@gmail.com","test@123"},
						{"john@gmail.com","test@123"},
						{"johncanedy@gmail.com","test"}
				
					};
		return data; 
	}
	
	@Test(dataProvider = "dp")
	void testlogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if (status==true)
		{
			 driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			 Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();	
			Assert.assertTrue(false);
		}
		
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
		
	}
	
	
	/*
	
	@DataProvider (name="dpExcel")
	Object[][] loginDataExcel()
	{
		Object exceldata = {}	
		
	}
	
	*/
	
}
