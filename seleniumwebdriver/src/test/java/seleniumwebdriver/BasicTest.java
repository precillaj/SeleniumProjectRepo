package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class BasicTest 
{		
	public static void main (String args[]) throws InterruptedException
	{
		
		// Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    // write one Implicit wait stmt and it will be applied through out the script
		
		// Open URL
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		// Verify page title
		String page_title = driver.getTitle();
			if (page_title.equals("DEMOQA"))
			{
					System.out.println("Page Title is -> " + page_title);
			}
			else 
			{
				System.out.println("Page Title is incorrect " + page_title);
			}
			
		// Close and Quit browser
			
		driver.close();
		driver.quit();
		
	}
	

}
