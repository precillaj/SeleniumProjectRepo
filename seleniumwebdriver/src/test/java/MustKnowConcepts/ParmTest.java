package MustKnowConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParmTest 
{
	
	WebDriver driver ;
	
	@BeforeClass
	@Parameters ({"browser", "URL"})
	void setup(String br, String URL) throws InterruptedException
	{
		switch (br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver(); break ;	// break keyword will exit from switch case 
		case "edge" : driver = new EdgeDriver(); break ;
		case "firefox" : driver = new FirefoxDriver(); break ;
		default : System.out.println("Invalid Browser"); return; // return keyword will completely exit from entire method
		}		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 1, dependsOnMethods = {"setup"})
	void testlogo()
	{
		boolean logostatus = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(logostatus, true);
	}
	
	@Test(priority = 2, dependsOnMethods = {"setup"})
	void testURL()
	{
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://opensource1-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test(priority = 3, dependsOnMethods = {"testURL"})
	void title()
	{
		AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
	}
		
	
	@AfterClass
	void teardown()
	{		
		driver.quit();
	}
	

}
